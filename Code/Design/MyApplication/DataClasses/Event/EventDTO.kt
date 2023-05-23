package com.example.ticketease.DataClasses.Event

import kotlinx.serialization.Serializable

@Serializable
data class EventDTO(val id : Long?,
                    val placeTimeId : Long,
                    val organizerId : Long,
                    val name : String,
                    val genre : GenreList,
                    val type : TypeList,
                    val status : StatusEvent = StatusEvent.CREATE,
                    val nameGroup : String? = null,
                    val description : String? = null)

