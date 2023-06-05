package com.example.ticketease.MVVM.Event.SelectTime

import com.example.ticketease.MVVM.Event.SelectPlace.SelectPlace

sealed class SelectTime {
    data class Time(val value : String) : SelectTime()
    object selectTime : SelectTime()
}