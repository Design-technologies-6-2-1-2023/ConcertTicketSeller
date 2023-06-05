package com.example.ticketease.MVVM.Person.Organizer.Personal

import com.example.ticketease.DataClasses.Person.BuyerResponse
import com.example.ticketease.DataClasses.Person.BuyerWithoutPswd
import com.example.ticketease.DataClasses.Person.OrganizerResponse
import com.example.ticketease.DataClasses.Person.OrganizerWithoutPswd
import com.example.ticketease.DataClasses.PlaceTime.PlaceDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceType

interface PersonalRepositoryOrg {

        suspend fun getByToken(organize: OrganizerResponse) : OrganizerWithoutPswd

        suspend fun get(place: PlaceType?): List<PlaceDTO>


}