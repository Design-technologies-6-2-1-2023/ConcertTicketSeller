package com.example.ticketease.DataClasses.Person
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement


fun String.toField(): JsonElement {
    return Json.parseToJsonElement(Buyer.serializer().toString())

}

fun Buyer.toJsonBody(): String {
    return Json.encodeToString(Buyer.serializer(), this)
}