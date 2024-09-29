package com.aetherlyssa.kotlincourse.lesson3

class Homework {

    const val event: String = "Hackathon Survival"       //   Название мероприятия, постоянное строковое


    var date: String = "22.09.2024"                      //   Дата мероприятия, изменяемое строковое (возможны изменения)

    var location: String = "Kazakhstan, Qostanai"        //   Место проведения, изменяемое строковое (возможна смена локации)

    private var eventbudget: String                      //   Расчет происходит в другом месте, изменяемое текстовое, приватное по запросу

    var members: Int = 0                                 //   Количество участников может добавляться или убавляться, точное число известно в конце, но всегда больше 0
        get () = field
        private set(value) {}                            //   Приват сеттер подсмотрел в уроке, изначально было условие if>=0

    val duration: Long = 80*60*60                        //   Продолжительность мероприятия

    private lateinit var contactsandservices: String     //   Контакты, условия, услуги - текстовое, изменяемое значение, по запросу

    var status: String = "Скоро"                         //   Статус, строковое изменяемое, например "дата" "скоро" "идет" "завершен"

    var sponsors = listOf("Sulpak", "Kaspy", "Open Society Foundations")    //   Cписок спонсоров через лист (почитал в интернете, не в ChatGPT)
                                                                            //   или
    var sponsors: String = "Sulpak", "Kaspy", "Open Society Foundations"    //   Cписок спонсоров через строку, изменяемое, но через list есть arrayListOf() (глубоко не вникал)

    var budget: Double = 100000.00                                          //   Бюджет мероприятия, числовое изменяемое

    var internet: Boolean = true                        //   Статус интернета, не совсем понял что это такое, но скорее всего интернет или есть или его нет

    // Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки



}

