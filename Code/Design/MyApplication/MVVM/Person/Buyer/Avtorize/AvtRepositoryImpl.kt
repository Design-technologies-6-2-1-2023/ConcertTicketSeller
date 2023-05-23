package com.example.ticketease.MVVM.Person.Buyer.Avtorize

import android.content.SharedPreferences
import com.example.ticketease.DataClasses.Person.Buyer
import com.example.ticketease.MVVM.Person.Buyer.BuyerRetrofitAPI
import com.example.ticketease.MVVM.Person.Buyer.Register.RegistResult

import retrofit2.HttpException

class AvtRepositoryImpl (private val api : BuyerRetrofitAPI,
                         private val prefs : SharedPreferences
): AvtRepository {
    override suspend fun Avtorize(buyer: Buyer): AvtResult<Unit> {
        return try {
            val response = api.Avtorize(buyer)
            prefs.edit().putString("token", response.token).apply()
            AvtResult.Registered()
        } catch (e: HttpException) {
            if (e.code() == 401) AvtResult.Unregistered() else
                AvtResult.UnknownError()
        }
    }
}