package com.example.ticketease.MVVM.Person.Organizer.Personal

import android.content.SharedPreferences
import com.example.ticketease.DataClasses.Person.OrganizerResponse
import com.example.ticketease.DataClasses.Person.OrganizerWithoutPswd
import com.example.ticketease.MVVM.Person.Buyer.BuyerRetrofitAPI

class PersonalRepositoryOrgImpl (

    private val api : BuyerRetrofitAPI,
    private val prefs : SharedPreferences
    ) : PersonalRepositoryOrg {
        override suspend fun getByToken(organize: OrganizerResponse): OrganizerWithoutPswd {
            val response = api.orgByToken(organize)
            val b = OrganizerWithoutPswd(response.name, response.surname, response.email, response.mobile, response.status, response.token)
            return b
        }
}