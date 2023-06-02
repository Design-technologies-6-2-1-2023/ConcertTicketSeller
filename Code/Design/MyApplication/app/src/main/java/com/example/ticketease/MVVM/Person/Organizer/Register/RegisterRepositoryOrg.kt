package com.example.ticketease.MVVM.Person.Organizer.Register

import com.example.ticketease.DataClasses.Person.Buyer
import com.example.ticketease.DataClasses.Person.Organizer
import com.example.ticketease.MVVM.Person.Buyer.Register.RegistResult

interface RegisterRepositoryOrg {
    suspend fun singInOrg(org: Organizer) : RegistResultOrg<Unit>

}