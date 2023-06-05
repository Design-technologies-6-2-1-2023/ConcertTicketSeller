package com.example.ticketease

import com.example.ticketease.DataClasses.PlaceTime.PlaceDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceTimeDTO
import com.example.ticketease.DataClasses.PlaceTime.StatusPlaceTime

fun getTime():List<PlaceTimeDTO> {
    var p=PlaceTimeDTO(10,10, "17:00" , StatusPlaceTime.FREE)
    var p2=PlaceTimeDTO(11,11, "18:00" , StatusPlaceTime.FREE)
    var p3=PlaceTimeDTO(12,12, "19:00" , StatusPlaceTime.FREE)
    var p4=PlaceTimeDTO(13, 13,"20:00" , StatusPlaceTime.FREE)
    var p5=PlaceTimeDTO(14,15, "8:00" , StatusPlaceTime.FREE)
    var l:List<PlaceTimeDTO> =listOf(p,p2, p2, p3, p4, p5)
    return  l
}