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
//val b : BuyerWithoutPswd = BuyerWithoutPswd("всвы", "высвы", "высвы", "", "")
class PersonalRepositoryImpl (
    private val api : BuyerRetrofitAPI,
    private val prefs : SharedPreferences
) : PersonalRepository {
    @SuppressLint("CommitPrefEdits")
    override suspend fun getByToken(buyer: BuyerResponse): BuyerWithoutPswd {
        val response = api.buyerByToken(buyer)
        val b =BuyerWithoutPswd(response.name, response.surname, response.email, response.mobile, response.token)
        prefs.edit().putString("name", response.name).apply()
        prefs.edit().putString("surname", response.surname).apply()
        prefs.edit().putString("email", response.email).apply()
        prefs.edit().putString("mobile", response.mobile).apply()

        //PersonalResult.Correct()


        return b
    }
}