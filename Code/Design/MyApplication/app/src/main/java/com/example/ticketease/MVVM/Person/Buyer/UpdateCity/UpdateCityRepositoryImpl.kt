package com.example.ticketease.MVVM.Person.Buyer.UpdateCity

import android.content.SharedPreferences
import com.example.ticketease.DataClasses.Person.BuyerUpdateCity
import com.example.ticketease.MVVM.Person.Buyer.BuyerRetrofitAPI
import com.example.ticketease.Screens.HelloPages.city

class UpdateCityRepositoryImpl (
    private val api : BuyerRetrofitAPI,
    private val prefs : SharedPreferences
) : UpdateCityRepository {
    override suspend fun UpdateBuyerCity(buyer: BuyerUpdateCity): Boolean {
        prefs.edit().putString("city", city.toString()).apply()
        return api.buyerUpdateCity(buyer)
    }
}