package com.example.ticketease.MVVM.Event.Catalog

import com.example.ticketease.DataClasses.Event.EventDTO

interface CatalogRepository {
    suspend fun getAllEvents():List<EventDTO>
}