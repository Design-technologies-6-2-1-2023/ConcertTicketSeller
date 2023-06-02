package com.example.ticketease.MVVM.Person.Buyer.UpdateCity

import com.example.ticketease.DataClasses.Person.BuyerUpdateCity
import com.example.ticketease.DataClasses.Person.BuyerWithoutPswd
import com.example.ticketease.MVVM.Person.Buyer.UpdateBuyer.UpdateBuyerResult

interface UpdateCityRepository {
    suspend fun UpdateBuyerCity(buyer: BuyerUpdateCity) :Boolean

}