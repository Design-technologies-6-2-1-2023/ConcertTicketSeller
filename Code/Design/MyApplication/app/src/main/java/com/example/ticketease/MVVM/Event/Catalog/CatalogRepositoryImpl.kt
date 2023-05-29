package com.example.ticketease.MVVM.Event.Catalog

import android.content.SharedPreferences
import com.example.ticketease.DataClasses.Event.EventDTO
import com.example.ticketease.MVVM.Person.Buyer.BuyerRetrofitAPI
import com.example.ticketease.MVVM.Person.Buyer.Register.RegistResult
import retrofit2.HttpException

class CatalogRepositoryImpl(private val api : BuyerRetrofitAPI
):CatalogRepository {
    override suspend fun getAllEvents():List<EventDTO> {
            val response = api.selectAllEvents()
        return  response

    }
}