package com.example.ticketease.DataClasses.Person

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

@Serializable
data class BuyerRequest(val login: String,val password: String)
@Serializable
data class BuyerResponse(val token : String)

@Serializable
data class Buyer(
    @JsonProperty("id")
    var id: Long? = null,
    @JsonProperty("name")
    var name: String = "",
    @JsonProperty("surname")
    var surname: String = "",
    @JsonProperty("login")
    var login: String = "",
    @JsonProperty("password")
    var password: String = "",
    @JsonProperty("email")
    var email: String = "",
    @JsonProperty("mobile")
    var mobile: String = "",
    @JsonProperty("city")
    var city: Cities? = null,
)
