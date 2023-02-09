package com.example.mymvvm.models.viewmodel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mymvvm.models.ModelClas
import com.example.mymvvm.repository.VisitRepository
import retrofit2.Call

class VisitViewModel(var visitRepository: VisitRepository) : ViewModel() {

    fun getCallApiVisit(): Call<List<ModelClas>> {
        return visitRepository.getCallApi()
    }

    /*fun getCallApiRxJavaVisit(): Observable<List<ModelClas>> {
        return visitRepository.getCallApiRxJava()
    }*/


}

class VisitViewModelFactory(var visitRepository: VisitRepository) :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return VisitViewModel(visitRepository) as T
    }
}