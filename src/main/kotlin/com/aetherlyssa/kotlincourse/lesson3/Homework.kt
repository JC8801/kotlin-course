package com.aetherlyssa.kotlincourse.lesson3

class Homework {

    const val event: String = "Hackathon Survival"       //   Название мероприятия, постоянное строковое
    var date: String = "22.09.2024"                      //   Дата мероприятия, изменяемое строковое (возможны изменения)
    var location: String = "Kazakhstan, Qostanai"        //   Место проведения, изменяемое строковое (возможна смена локации)
    lateinit var eventbudget: Int                        //   Расчет происходит в другом месте с подключением других переменных, изменяемое числовое

}

