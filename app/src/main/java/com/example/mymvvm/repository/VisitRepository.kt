package com.example.mymvvm.repository

import com.example.mymvvm.apitools.ApiInterface
import com.example.mymvvm.models.ModelClas
import retrofit2.Call

class VisitRepository(var retrofit: ApiInterface) {

    fun getCallApi(): Call<List<ModelClas>> {
        return retrofit.getdata()
    }
}