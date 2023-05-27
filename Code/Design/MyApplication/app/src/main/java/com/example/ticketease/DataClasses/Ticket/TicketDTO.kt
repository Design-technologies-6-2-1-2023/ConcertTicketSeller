package com.example.ticketease.DataClasses.Ticket

import kotlinx.serialization.Serializable

@Serializable
data class TicketDTO(val id : Long?,
                     val eventId : Long,
                     val buyerId : Long? = null,
                     val row : Int? = null,
                     val column : Int? = null,
                     val status : StatusTicket = StatusTicket.SALE,
                     val price : Double)


