package com.example.ticketease.MVVM.Event.Catalog

import android.content.SharedPreferences
import com.example.ticketease.DataClasses.Event.EventDTO
import com.example.ticketease.MVVM.Person.Buyer.BuyerRetrofitAPI
import com.example.ticketease.MVVM.Person.Buyer.Register.RegistResult
import retrofit2.HttpException
//var listCatalog: List<EventDTO> = listOf()

class CatalogRepositoryImpl(private val api : BuyerRetrofitAPI,
                            private val prefs : SharedPreferences
):CatalogRepository {
    override suspend fun getAllEvents(): CatalogResult<Unit> {
        return try {
            val response = api.selectAllEvents()
           // prefs.getString()

            CatalogResult.Correct()
        }catch  (e: HttpException){
            CatalogResult.UnknownError()
        }
    }
}