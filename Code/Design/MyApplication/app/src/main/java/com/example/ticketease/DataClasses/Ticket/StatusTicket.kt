package com.example.ticketease.DataClasses.Ticket

enum class StatusTicket(val status : String){
    SALE("В продаже"),
    BOOK("Забронирован"),
    SOLD("Выкуплен"),
    DELETE("Отменен")
}

