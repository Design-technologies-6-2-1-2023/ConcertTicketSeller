package com.example.ticketease.MVVM.Person.Buyer.Catalog

import com.example.ticketease.DataClasses.Catalog
import com.example.ticketease.DataClasses.Person.Cities

interface CatalogRepository {
    suspend fun catalog(city: String?): List<Catalog>

}