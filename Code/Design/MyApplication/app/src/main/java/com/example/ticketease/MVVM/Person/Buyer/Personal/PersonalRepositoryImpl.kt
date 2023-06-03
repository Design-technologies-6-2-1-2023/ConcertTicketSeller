package com.example.ticketease.MVVM.Person.Buyer.Personal

import android.annotation.SuppressLint
import android.content.SharedPreferences
import com.example.ticketease.DataClasses.Person.Buyer
import com.example.ticketease.DataClasses.Person.BuyerResponse
import com.example.ticketease.DataClasses.Person.BuyerWithoutPswd
import com.example.ticketease.MVVM.Person.Buyer.BuyerRetrofitAPI
import com.example.ticketease.MVVM.Person.Buyer.Register.RegistResult
import com.example.ticketease.MVVM.Person.Buyer.Register.RegisterRepository
import retrofit2.HttpException
class PersonalRepositoryImpl (
            private val api : BuyerRetrofitAPI,
            private val prefs : SharedPreferences
        ) : PersonalRepository {
            override suspend fun getByToken(buyer: BuyerResponse): BuyerWithoutPswd {
                val response = api.buyerByToken(buyer)
                val b =BuyerWithoutPswd(response.name, response.surname, response.email, response.mobile, response.token)
                return b
    }
}