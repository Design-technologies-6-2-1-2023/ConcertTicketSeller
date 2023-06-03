package com.example.ticketease.MVVM.Person.Organizer.UpdateOrganizer

import android.content.SharedPreferences
import com.example.ticketease.DataClasses.Person.BuyerWithoutPswd
import com.example.ticketease.DataClasses.Person.OrganizerWithoutPswd
import com.example.ticketease.MVVM.Person.Buyer.BuyerRetrofitAPI
import com.example.ticketease.MVVM.Person.Buyer.UpdateBuyer.UpdateBuyerRepository
import com.example.ticketease.MVVM.Person.Buyer.UpdateBuyer.UpdateBuyerResult
import com.google.gson.Gson
import retrofit2.HttpException

class UpdateOrgRepositoryImpl (private val api : BuyerRetrofitAPI,
                               private val prefs : SharedPreferences
): UpdateOrgRepository {
    override suspend fun UpdateOrg(org: OrganizerWithoutPswd): UpdateOrgResult<Unit> {
        try {
            org.token= prefs.getString("token",null)!!
            val response = api.orgUpdate(org)
            prefs.edit().putString("organizer", Gson().toJson(response)).apply()
            return  UpdateOrgResult.Correct()
        } catch (e: HttpException) {

            return UpdateOrgResult.Uncorrect()
        }

    }
}