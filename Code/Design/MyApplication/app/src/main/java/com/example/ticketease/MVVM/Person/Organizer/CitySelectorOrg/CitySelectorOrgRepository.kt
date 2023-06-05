package com.example.ticketease.MVVM.Person.Organizer.CitySelectorOrg

import com.example.ticketease.DataClasses.Person.BuyerUpdateCity
import com.example.ticketease.DataClasses.Person.OrganizerUpdateCity

interface CitySelectorOrgRepository {
    suspend fun update(organizer: OrganizerUpdateCity?): Boolean

}