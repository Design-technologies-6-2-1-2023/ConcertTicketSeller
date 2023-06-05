package com.example.ticketease.DataClasses

import com.google.gson.annotations.SerializedName

data class CatalogResponce (
    @SerializedName("values")
    val values: List<Catalog>,
    @SerializedName("index")
    val index: Int,
    @SerializedName("size")
    val size: Int,
    @SerializedName("last")
    val last: Boolean
)