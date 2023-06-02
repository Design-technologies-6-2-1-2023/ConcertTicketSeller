package com.example.ticketease.DataClasses

import kotlinx.serialization.Serializable

@Serializable
data class PlaceDTO(
    val id : Long?,
    val name : String,
    val capacity: Long,
    val numRow: Int?,
    val numColumn: Int?
)

