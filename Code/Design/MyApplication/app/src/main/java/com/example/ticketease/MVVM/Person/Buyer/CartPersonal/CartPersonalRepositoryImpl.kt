package com.example.ticketease.MVVM.Person.Buyer.CartPersonal

import android.content.SharedPreferences
import com.example.ticketease.DataClasses.Catalog
import com.example.ticketease.DataClasses.Person.BuyerId
import com.example.ticketease.DataClasses.Person.BuyerUpdateCity
import com.example.ticketease.DataClasses.Person.BuyerWithoutPswd
import com.example.ticketease.DataClasses.Person.City
import com.example.ticketease.DataClasses.Ticket.TicketDTO
import com.example.ticketease.MVVM.Person.Buyer.BuyerRetrofitAPI
import com.google.gson.Gson

class CartPersonalRepositoryImpl(
    private val api : BuyerRetrofitAPI,
    private val prefs : SharedPreferences
) : CartPersonalRepository {

    override suspend fun getAllEvents(): List<Catalog>  =
        api.getAllEvents(City(prefs.getString("city", "")!!))

    override suspend fun preferencesRoom(): List<Catalog>  =
        api.preferencesRoom(
            BuyerUpdateCity(
                Gson().fromJson(prefs.getString("buyer",null)!!,
                    BuyerWithoutPswd::class.java).token,prefs.getString("city", "")!!)
        )


    override suspend fun selectEventByBuyer(): List<Long>  = api.selectEventByBuyer(
        BuyerId(
            Gson().fromJson(prefs.getString("buyer",null)!!,
                BuyerWithoutPswd::class.java).id)
    )

    override suspend fun updateTicket(ticketDTO: TicketDTO): TicketDTO = api.updateTicket(ticketDTO)
}