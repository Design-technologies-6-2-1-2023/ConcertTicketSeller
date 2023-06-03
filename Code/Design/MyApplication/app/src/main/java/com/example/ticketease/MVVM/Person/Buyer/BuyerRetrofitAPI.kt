package com.example.ticketease.MVVM.Person.Buyer

import com.example.ticketease.DataClasses.Catalog
import com.example.ticketease.DataClasses.Event.EventDTO
import com.example.ticketease.DataClasses.Person.*
import com.example.ticketease.DataClasses.PlaceTime.PlaceDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceTimeDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceType
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.PUT

interface BuyerRetrofitAPI {
    @POST("/buyers/create")
   suspend fun postBuyer(@Body dataModel: Buyer?): BuyerWithoutPswd

    @POST("/buyers/signIn")
    suspend fun avtorize(@Body dataModel: BuyerRequest?): BuyerWithoutPswd

    @POST("/buyers/token")
   suspend  fun buyerByToken(@Body dataModel: BuyerResponse?):  BuyerWithoutPswd

    @PUT("/buyers/id/update")
    suspend  fun buyerUpdate(@Body dataModel: BuyerWithoutPswd?):  BuyerWithoutPswd

    @POST("/buyers/updateCity")
     suspend  fun buyerUpdateCity(@Body dataModel: BuyerUpdateCity?):Boolean


    @POST("/organizers/create")
    suspend fun singInOrg(@Body dataModel: Organizer?): OrganizerWithoutPswd


    @PUT("/organizers/signIn")
    suspend fun avtorizeOrg(@Body dataModel: OrganizerRequest?): OrganizerWithoutPswd


    @POST("/organizers/token")
    suspend fun orgByToken(@Body dataModel: OrganizerResponse?):  OrganizerWithoutPswd


 @POST("/room/catalog")
 suspend fun catalog(@Body city: String?): List<Catalog>

 @POST("/organizers/updateCity")
 suspend  fun organizersUpdateCity(@Body dataModel: OrganizerUpdateCity?):Boolean

 @PUT("/organizers/id/update")
 suspend  fun orgUpdate(@Body dataModel: OrganizerWithoutPswd?):  OrganizerWithoutPswd

 @POST("/events/create")
 suspend fun enterEventsParam(@Body dataModel: EventDTO?):  EventDTO

 @POST("/places/type")
 suspend fun getPlace(@Body dataModel: PlaceType?):  List<PlaceDTO>
}