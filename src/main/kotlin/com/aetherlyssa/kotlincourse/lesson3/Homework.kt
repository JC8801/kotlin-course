package com.aetherlyssa.kotlincourse.lesson3

class Homework {

    const val event: String = "Hackathon Survival"       //   Название мероприятия, постоянное строковое


    var date: String = "22.09.2024"                      //   Дата мероприятия, изменяемое строковое (возможны изменения)

    var location: String = "Kazakhstan, Qostanai"        //   Место проведения, изменяемое строковое (возможна смена локации)

    lateinit var eventbudget: Int                        //   Расчет происходит в другом месте с подключением других переменных, изменяемое числовое

    var members: Int = 0                                 //   Колличество участников может добавляться или убавляться, точное число известно в конце, но всегда больше 0
        get () = field
        set(value) {
            if (value >= 0) field = value
        }

    val duration: Double = 4.50                          //   Продолжительность заранее запланирована, заявлять изменение продолжительности посфактум не вижу смысла,
                                                         //   постоянное числовое, Duoble достаточно для округления с точностью до целого часа, получаса, минут

    private lateinit var contactsandservices: String     //   Контакты, условия, услуги - текстовое, изменяемое значение, по запросу

    var status: String = "Скоро"                         //   Статус, строковое изменяемое, например "дата" "скоро" "идет" "завершен"

    var sponsors = listOf("Sulpak", "Kaspy", "Open Society Foundations")    //   Cписок спонсоров через лист (почитал в интернете, не в ChatGPT)
                                                                            //   или
    var sponsors: String = "Sulpak", "Kaspy", "Open Society Foundations"    //   Cписок спонсоров через строку, изменяемое, но через list есть arrayListOf() (глубоко не вникал)



}

