package com.example.ticketease.MVVM.Person.Buyer.Personal
import android.content.SharedPreferences
import com.example.ticketease.DataClasses.Catalog
import com.example.ticketease.DataClasses.Person.*
import com.example.ticketease.MVVM.Person.Buyer.BuyerRetrofitAPI
import com.example.ticketease.MVVM.Person.Buyer.Register.RegistResult
import com.example.ticketease.MVVM.Person.Buyer.Register.RegisterRepository
import com.google.gson.Gson

class PersonalRepositoryImpl (
    private val api : BuyerRetrofitAPI,
    private val prefs : SharedPreferences
) : PersonalRepository {
    override suspend fun getByToken(buyer: BuyerResponse): BuyerWithoutPswd {
        return api.buyerByToken(buyer)
    }
    override suspend fun getAllEvents(): List<Catalog>  =
        api.getAllEvents(City(prefs.getString("city", null)!!))

    override suspend fun preferencesRoom(): List<Catalog>  =
        api.preferencesRoom(
            BuyerUpdateCity(
            Gson().fromJson(prefs.getString("buyer",null)!!,
                BuyerWithoutPswd::class.java).token,prefs.getString("city", "")!!)
        )


    override suspend fun selectEventByBuyer(): List<Long>  = api.selectEventByBuyer(
        BuyerId(Gson().fromJson(prefs.getString("buyer",null)!!,
            BuyerWithoutPswd::class.java).id)
    )

}