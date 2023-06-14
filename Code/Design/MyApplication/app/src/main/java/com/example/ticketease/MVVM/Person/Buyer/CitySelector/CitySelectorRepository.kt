package com.example.ticketease.MVVM.Person.Buyer.CitySelector

import com.example.ticketease.DataClasses.Catalog
import com.example.ticketease.DataClasses.Person.BuyerUpdateCity
import com.example.ticketease.DataClasses.Person.Cities

interface CitySelectorRepository {
    suspend fun update(buyer: BuyerUpdateCity?): Boolean

}