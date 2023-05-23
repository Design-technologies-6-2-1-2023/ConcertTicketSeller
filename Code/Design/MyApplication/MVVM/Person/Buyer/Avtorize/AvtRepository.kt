package com.example.ticketease.MVVM.Person.Buyer.Avtorize

import com.example.ticketease.DataClasses.Person.Buyer

interface AvtRepository {
    suspend fun Avtorize(buyer: Buyer) : AvtResult<Unit>

}