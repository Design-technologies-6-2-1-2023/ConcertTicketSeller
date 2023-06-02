package com.example.ticketease.DataClasses.PlaceTime

import com.example.ticketease.DataClasses.DateSerializer
import kotlinx.serialization.Serializable
import java.time.Instant

@Serializable
data class PlaceTimeDTO(val id: Long?,
                        val placeId : Long,
                        @Serializable(with = DateSerializer::class)
                        val date : Instant,
                        val status : StatusPlaceTime)

