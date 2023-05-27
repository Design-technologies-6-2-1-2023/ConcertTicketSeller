package com.example.ticketease.MVVM.Person.Buyer.Avtorize

import android.content.SharedPreferences
import com.example.ticketease.DataClasses.Person.Buyer
import com.example.ticketease.DataClasses.Person.BuyerRequest
import com.example.ticketease.DataClasses.Person.BuyerResponse
import com.example.ticketease.DataClasses.Person.BuyerWithoutPswd
import com.example.ticketease.MVVM.Person.Buyer.BuyerRetrofitAPI
import com.example.ticketease.MVVM.Person.Buyer.Register.RegistResult

import retrofit2.HttpException

var token:String=""

class AvtRepositoryImpl (private val api : BuyerRetrofitAPI,
                         private val prefs : SharedPreferences
): AvtRepository {
    override suspend fun Avtorize(buyer: BuyerRequest): AvtResult<Unit> {
        return try {
            val response = api.Avtorize(buyer)

            prefs.edit().putString("token", response.token).apply()
            token = response.token
            AvtResult.Avtorized()
        } catch (e: HttpException) {
            if (e.code() == 401) AvtResult.IncorrectPassword() else
                AvtResult.UnknownLogin()
        }
    }

}