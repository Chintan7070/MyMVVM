package com.example.mymvvm.apitools

import retrofit2.Retrofit
//import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object{
        fun getRetInterfaced(): ApiInterface {

            val retrofit  = Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com")
                //.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            val apiInterface = retrofit.create(ApiInterface::class.java)


            return apiInterface as ApiInterface
        }
    }
}