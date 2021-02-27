package com.example.hiltexample.retrofit

import com.example.hiltexample.model.Blog
import retrofit2.http.GET

interface BlogRetrofit {

    @GET("posts/1")
    suspend fun getBlog(): Blog
}