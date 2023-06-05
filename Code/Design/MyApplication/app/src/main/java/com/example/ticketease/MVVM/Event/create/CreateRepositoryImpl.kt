package com.example.ticketease.MVVM.Event.create

import android.content.SharedPreferences
import com.example.ticketease.DataClasses.PlaceTime.PlaceDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceType
import com.example.ticketease.DataClasses.Ticket.TicketCountWithPrice
import com.example.ticketease.MVVM.Person.Buyer.BuyerRetrofitAPI

class CreateRepositoryImpl(private val api : BuyerRetrofitAPI,
private val prefs : SharedPreferences
):CreateRepository {
    override suspend fun create(place: TicketCountWithPrice) {
        return api.createRoom(place)
    }
}