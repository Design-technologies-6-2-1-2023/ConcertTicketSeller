package com.example.ticketease.DataClasses.Ticket

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

@Serializable
data class TicketDTO(
    @JsonProperty("id")
    val id: Long?=null,
    @JsonProperty("eventId")
    val eventId: Long? =null,
    @JsonProperty("buyerId")

    val buyerId: Long? = null,
    @JsonProperty("row")

    val row: Int? = null,
    @JsonProperty("column")

    val column: Int? = null,
    @JsonProperty("status")

    val status: StatusTicket = StatusTicket.SALE,
    @JsonProperty("price")

    val price: String=""
)


@Serializable
data class TicketCountWithPrice(
    @JsonProperty("eventId")

    val eventId: Long? =null,
    @JsonProperty("eventId")

    val capacity: Long? =null,
    @JsonProperty("eventId")

    val row: Int? = null,
    @JsonProperty("eventId")

    val column: Int? = null,
    @JsonProperty("eventId")

    val price: Double? =null
    )