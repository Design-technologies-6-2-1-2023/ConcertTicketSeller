package com.example.ticketease.MVVM.Person.Buyer.UpdateBuyer

import com.example.ticketease.DataClasses.Person.BuyerRequest
import com.example.ticketease.DataClasses.Person.BuyerWithoutPswd
import com.example.ticketease.MVVM.Person.Buyer.Avtorize.AvtResult

interface UpdateBuyerRepository {
    suspend fun UpdateBuyer(buyer: BuyerWithoutPswd) : UpdateBuyerResult<Unit>

}