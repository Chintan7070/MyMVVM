package com.example.mymvvm.apitools

import com.example.mymvvm.models.ModelClas
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("/comments?postId=1")
    fun getdata() : Call<List<ModelClas>>
}