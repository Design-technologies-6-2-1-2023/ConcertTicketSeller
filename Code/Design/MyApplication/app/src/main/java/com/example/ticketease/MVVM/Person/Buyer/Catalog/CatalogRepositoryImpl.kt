package com.example.ticketease.MVVM.Person.Buyer.Catalog

import android.content.SharedPreferences
import com.example.ticketease.DataClasses.Catalog
import com.example.ticketease.DataClasses.Event.EventId
import com.example.ticketease.DataClasses.Person.*
import com.example.ticketease.MVVM.Person.Buyer.BuyerRetrofitAPI

import kotlinx.coroutines.flow.Flow
import com.google.gson.Gson

class CatalogRepositoryImpl(private val api : BuyerRetrofitAPI,
                            private val prefs :SharedPreferences
):CatalogRepository {
    override suspend fun getAllEvents(): List<Catalog>  =
        api.getAllEvents(City(prefs.getString("city", "")!!))

    override suspend fun preferencesRoom(): List<Catalog>  =
        api.preferencesRoom(
            BuyerUpdateCity(
                Gson().fromJson(prefs.getString("buyer",null)!!,
                    BuyerWithoutPswd::class.java).token,prefs.getString("city", "")!!)
        )


    override suspend fun selectEventByBuyer(): List<Long>  = api.selectEventByBuyer(
        BuyerId(
            Gson().fromJson(prefs.getString("buyer",null)!!,
                BuyerWithoutPswd::class.java).id)
    )
    override suspend fun countSoldTicket(eventId: EventId): Long = api.countSoldTicket(eventId)
    override suspend fun ticketRoom(eventId: EventId): Catalog = api.ticketRoom(eventId)
}