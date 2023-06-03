package com.example.ticketease.MVVM.Person.Buyer.Catalog

import android.content.SharedPreferences
import com.example.ticketease.DataClasses.Catalog
import com.example.ticketease.DataClasses.Person.Cities
import com.example.ticketease.MVVM.Person.Buyer.BuyerRetrofitAPI

class CatalogRepositoryImpl  (
    private val api : BuyerRetrofitAPI,
    private val prefs : SharedPreferences
) : CatalogRepository {
    override suspend fun catalog(ciy: String?): List<Catalog> {

        return api.catalog(ciy)
    }
}