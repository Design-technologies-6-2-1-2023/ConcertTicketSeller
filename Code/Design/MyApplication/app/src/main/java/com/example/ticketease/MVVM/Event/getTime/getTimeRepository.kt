package com.example.ticketease.MVVM.Event.getTime

import com.example.ticketease.DataClasses.PlaceTime.PlaceDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceId
import com.example.ticketease.DataClasses.PlaceTime.PlaceTimeDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceType

interface getTimeRepository {
    suspend fun get(place: PlaceId?): List<PlaceTimeDTO>

}