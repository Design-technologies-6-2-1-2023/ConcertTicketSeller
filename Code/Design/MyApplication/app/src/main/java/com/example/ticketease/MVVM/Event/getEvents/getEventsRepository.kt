package com.example.ticketease.MVVM.Event.getEvents

import com.example.ticketease.DataClasses.Catalog
import com.example.ticketease.DataClasses.PlaceTime.PlaceDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceTimeDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceType

interface getEventsRepository {
    suspend fun get(place: PlaceType?): List<PlaceDTO>

}