package com.example.ticketease.DataClasses.Person

import kotlinx.serialization.Serializable

@Serializable
data class OrganizerRequest(val login: String,val password: String)
@Serializable
data class OrganizerResponse(val token : String)

@Serializable
data class Organizer(
    val id: Long,
    val name: String,
    val surname: String,
    val login: String,
    val password: String,
    val email: String,
    val mobile: String? = null,
    val city: Cities,
    val status: StatusOrganizer,
    val secret : String? = null)
