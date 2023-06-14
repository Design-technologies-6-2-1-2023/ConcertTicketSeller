package com.example.ticketease.MVVM.Person.Organizer.UpdateOrganizer

import com.example.ticketease.DataClasses.Person.BuyerWithoutPswd
import com.example.ticketease.DataClasses.Person.OrganizerWithoutPswd
import com.example.ticketease.MVVM.Person.Buyer.UpdateBuyer.UpdateBuyerResult

interface UpdateOrgRepository {
    suspend fun UpdateOrg(org: OrganizerWithoutPswd) : UpdateOrgResult<Unit>

}