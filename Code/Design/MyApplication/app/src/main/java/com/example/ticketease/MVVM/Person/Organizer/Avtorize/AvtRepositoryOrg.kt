package com.example.ticketease.MVVM.Person.Organizer.Avtorize

import com.example.ticketease.DataClasses.Person.BuyerRequest
import com.example.ticketease.DataClasses.Person.OrganizerRequest
import com.example.ticketease.MVVM.Person.Buyer.Avtorize.AvtResult

interface AvtRepositoryOrg {
    suspend fun avtorizeOrg(organize: OrganizerRequest) : AvtResultOrg<Unit>

}