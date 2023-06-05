package com.example.ticketease.MVVM.Event.create

import com.example.ticketease.DataClasses.PlaceTime.PlaceDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceType
import com.example.ticketease.DataClasses.Ticket.TicketCountWithPrice

interface CreateRepository {
    suspend fun create(place: TicketCountWithPrice)

}