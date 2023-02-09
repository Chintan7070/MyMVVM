package com.example.mymvvm

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.mymvvm.apitools.RetrofitClient.Companion.getRetInterfaced
import com.example.mymvvm.models.ModelClas
import com.example.mymvvm.models.viewmodel.VisitViewModel
import com.example.mymvvm.models.viewmodel.VisitViewModelFactory
import com.example.mymvvm.repository.VisitRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var visitViewMode: VisitViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        callApi();
    }

    private fun callApi() {

        val visitRepository = VisitRepository(getRetInterfaced())
        val visitViewModelFactory = VisitViewModelFactory(visitRepository)
        visitViewMode =  ViewModelProvider(this, visitViewModelFactory).get(VisitViewModel::class.java)

        visitViewMode.getCallApiVisit().enqueue(object : Callback<List<ModelClas>> {
            override fun onResponse(
                call: Call<List<ModelClas>>,
                response: Response<List<ModelClas>>
            ) {
                Log.e("TAG", "onResponse: Success ----"+response.body() )
            }

            override fun onFailure(call: Call<List<ModelClas>>, t: Throwable) {
                Log.e("TAG", "onResponse: Success fail----" )
            }

        })
        
    }
}