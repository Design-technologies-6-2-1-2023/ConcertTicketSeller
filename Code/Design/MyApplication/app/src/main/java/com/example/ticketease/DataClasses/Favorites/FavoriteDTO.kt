package com.example.DataClasses.Favorites

import kotlinx.serialization.Serializable

@Serializable
data class FavoriteDTO(val buyerId : Long,
                       val eventId : Long,
                       val status : StatusFavorite = StatusFavorite.IS)
