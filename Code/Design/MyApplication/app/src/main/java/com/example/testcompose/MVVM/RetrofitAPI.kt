package com.example.testcompose.MVVM

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RetrofitAPI {

    @POST("/buyers/create")
    fun postData(@Body dataModel: RegisterUserItem?): Call<RegisterUserItem?>?
}