package com.example.ticketease.DataClasses.Event

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

@Serializable
data class EventDTO(
    @JsonProperty("id")
    val id : Long?,
    @JsonProperty("placeTimeId")

    val placeTimeId : Long,
    @JsonProperty("organizerId")

    val organizerId : Long,
    @JsonProperty("name")

    val name : String,
    @JsonProperty("genre")

    val genre : GenreList,
    @JsonProperty("type")

    val type : TypeList,
    @JsonProperty("status")

    val status : StatusEvent = StatusEvent.CREATE,
    @JsonProperty("nameGroup")

    val nameGroup : String? = null,
    @JsonProperty("description")

    val description : String? = null)

