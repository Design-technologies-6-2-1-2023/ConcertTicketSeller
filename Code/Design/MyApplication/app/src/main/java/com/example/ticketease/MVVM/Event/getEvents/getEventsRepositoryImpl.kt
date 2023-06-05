package com.example.ticketease.MVVM.Event.getEvents

import android.content.SharedPreferences
import com.example.ticketease.DataClasses.PlaceTime.PlaceDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceTimeDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceType
import com.example.ticketease.MVVM.Person.Buyer.BuyerRetrofitAPI

class getEventsRepositoryImpl(private val api : BuyerRetrofitAPI,
                              private val prefs : SharedPreferences
):getEventsRepository {
    override suspend fun get(place: PlaceType?): List<PlaceDTO> {
        return api.getPlace(place)
    }
}