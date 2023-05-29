package com.example.ticketease.MVVM.Person.Buyer

import com.example.ticketease.DataClasses.Event.EventDTO
import com.example.ticketease.DataClasses.Person.Buyer
import com.example.ticketease.DataClasses.Person.BuyerRequest
import com.example.ticketease.DataClasses.Person.BuyerResponse
import com.example.ticketease.DataClasses.Person.BuyerWithoutPswd
import retrofit2.http.Body
import retrofit2.http.POST

interface BuyerRetrofitAPI {
    @POST("/buyers/create")
   suspend fun postBuyer(@Body dataModel: Buyer?): BuyerWithoutPswd

    @POST("/buyers/signIn")
    suspend fun avtorize(@Body dataModel: BuyerRequest?): BuyerWithoutPswd

    @POST("/buyers/token")
   suspend  fun buyerByToken(@Body dataModel: BuyerResponse?):  BuyerWithoutPswd
    @POST("/events")
    suspend  fun selectAllEvents():  List<EventDTO>
}