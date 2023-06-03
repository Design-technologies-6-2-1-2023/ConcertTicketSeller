package com.example.ticketease.MVVM.Person.Buyer.Register

import com.example.ticketease.DataClasses.Person.Buyer

interface RegisterRepository {
    suspend fun signIn(buyer: Buyer) : RegistResult<Unit>
}