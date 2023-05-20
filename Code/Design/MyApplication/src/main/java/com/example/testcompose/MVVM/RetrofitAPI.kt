package com.example.testcompose.MVVM

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.POST
import retrofit2.http.PUT

interface RetrofitAPI {

    @POST("buyers/create")
    fun postData(@Body dataModel: RegisterUserItem?): Call<RegisterUserItem?>?

    @DELETE("{id}")
    fun deleteBuyer(): Call<RegisterUserItem?>?

    @PUT("{id}/update")
    fun updateBuyer(@Body dataModel: RegisterUserItem?): Call<RegisterUserItem?>?

    @PUT("signIn")
    fun signInBuyer(@Body dataModel: RegisterUserItem?): Call<RegisterUserItem?>?
}