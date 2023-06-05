package com.example.ticketease.DataClasses.PlaceTime

import com.example.ticketease.DataClasses.DateSerializer
import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable
import java.time.Instant

@Serializable
data class PlaceTimeDTO(
    @JsonProperty("id")
    val id: Long?=null,
    @JsonProperty("placeId")

    var placeId: Long? =null,
    @JsonProperty("date")

    @Serializable(with = DateSerializer::class)
    var date: String? =null,
    @JsonProperty("status")
    var status: StatusPlaceTime? =null
    )

