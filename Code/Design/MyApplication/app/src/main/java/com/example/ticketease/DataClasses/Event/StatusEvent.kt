package com.example.ticketease.DataClasses.Event

enum class StatusEvent(val status : String){
    CREATE("Создаётся"),
    CREATED("Создано"),
    ISGONE("Проведено"),
    DELETE("Отменено")
}
