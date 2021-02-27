package com.example.hiltexample.repo

import com.example.hiltexample.retrofit.BlogRetrofit
import javax.inject.Inject

class Repository  @Inject constructor(
    private val api: BlogRetrofit
){


    suspend fun getBlog():String{
       return api.getBlog().title
    }

}