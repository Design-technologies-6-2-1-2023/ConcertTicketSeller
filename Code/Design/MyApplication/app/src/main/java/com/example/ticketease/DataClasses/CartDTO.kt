package com.example.ticketease.DataClasses


import kotlinx.serialization.Serializable
import java.time.Instant

@Serializable
data class CartDTO(val buyerId: Long,
                   val ticketId : Long,
                   @Serializable(with = DateSerializer::class)
                   val orderDate : Instant? = null)


