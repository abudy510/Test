package com.example.hiltexample.viewModel

import androidx.lifecycle.ViewModel
import com.example.hiltexample.repo.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@HiltViewModel
class MyViewModel
@Inject
constructor(
    private val repository: Repository
):ViewModel() {

    suspend fun getTitle():String{
        return repository.getBlog()
    }

}