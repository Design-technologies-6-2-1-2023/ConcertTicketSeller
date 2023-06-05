package com.example.ticketease

import com.example.ticketease.DataClasses.PlaceTime.PlaceDTO

fun getPlace(city:String) :List<PlaceDTO>{

    if (city == "Moscow") {
        var p=PlaceDTO(10, "Концертный зал «Измайлово»" , 30000, 60, 150, "Измайловское ш., 71, корп. 5", "Moscow")
        var p2=PlaceDTO(11, "Концертный зал им. Чайковского" , 12000, 20, 80, "Тверская, 31/4", "Moscow")
        var p3=PlaceDTO(12, "Москонцерт-холл" , 1000, 20, 80, "Каланчевская, 33/12, стр.2", "Moscow")
        var p4=PlaceDTO(13, "Барвиха Luxury Village" , 2000, 20, 80, "8-й км Рублево-Успенского ш.", "Moscow")
        var p5=PlaceDTO(14, "ДК им. Зуева" , 500, 20, 80, "Лесная, 18", "Moscow")
        var l:List<PlaceDTO> =listOf(p,p2, p2, p3, p4, p5)
        return  l
    } else if (city == "Voronezh"){
        var p=PlaceDTO(15, "Event Hall" , 3000, 60, 60, "Воронеж, пос. Солнечный, Парковая, 3, сити-парк «Град», 2 этаж", "Voronezh")
        var p2=PlaceDTO(16, "Воронежский концертный зал" , 1000, 40, 80, "Воронеж, Театральная, 17", "Voronezh")
        var p3=PlaceDTO(17, "Воронежская филармония" , 1000, 60, 80, "Воронеж, пл. Ленина, 11а", "Voronezh")
        var p4=PlaceDTO(18, "Воронежский ДК железнодорожников" , 8000, 20, 180, "Воронеж, Никитинская, 1", "Voronezh")
        var p5=PlaceDTO(19, "ДК «Шилово»" , 500, 20, 80, "Воронеж, п. Шилово, Теплоэнергетиков, 8а", "Voronezh")
        var l:List<PlaceDTO> =listOf(p,p2, p2, p3, p4, p5)
    }else if(city=="SaintPetersburg"){
        var p=PlaceDTO(20, "Концертный зал в здании Екатерининского собрания" , 3000, 60, 60, "Санкт-Петербург, наб. канала Грибоедова, 88–90", "SaintPetersburg")
        var p2=PlaceDTO(21, "Малый зал Петербургской филармонии" , 1000, 40, 80, "Санкт-Петербург, Невский просп., 30", "SaintPetersburg")
        var p3=PlaceDTO(22, "Концертный зал Мариинского театра" , 1000, 60, 80, "Санкт-Петербург, Писарева, 20", "SaintPetersburg")
        var p4=PlaceDTO(23, "Космонавт" , 8000, 20, 180, "Санкт-Петербург, Бронницкая, 24", "SaintPetersburg")
        var p5=PlaceDTO(24, "Центр современного искусства им. Сергея Курехина" , 500, 20, 80, "Санкт-Петербург, Лиговский просп., 73", "SaintPetersburg")
        var l:List<PlaceDTO> =listOf(p,p2, p2, p3, p4, p5)
    }
    return listOf()
}