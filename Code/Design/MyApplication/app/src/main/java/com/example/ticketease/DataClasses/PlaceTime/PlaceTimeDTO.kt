package com.example.ticketease.DataClasses.PlaceTime

import com.example.ticketease.DataClasses.DateSerializer
import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

@Serializable
data class PlaceTimeDTO(
    @JsonProperty("id")
    val id: Long?=null,
    @JsonProperty("placeId")

    val placeId: Long? =null,
    @JsonProperty("date")

    @Serializable(with = DateSerializer::class)
    var date: String="",
    @JsonProperty("status")

    val status: StatusPlaceTime? =null
    )

