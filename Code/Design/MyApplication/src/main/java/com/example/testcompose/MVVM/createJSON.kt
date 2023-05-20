package com.example.testcompose.MVVM
import kotlinx.serialization.json.Json
import kotlinx.serialization.*
import kotlinx.serialization.json.JsonElement


fun String.toField(): JsonElement {

    return Json.parseToJsonElement(RegisterUserItem.serializer().toString())

}

fun RegisterUserItem.toJsonBody(): String {

    return Json.encodeToString(RegisterUserItem.serializer(), this)
}