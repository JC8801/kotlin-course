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
    val sponsors: String = "Sulpak", "Kaspy", "Open Society Foundations"    //   Cписок спонсоров через строку, известен заранее, но через list есть arrayListOf() (глубоко не вникал)

    var budget: Double = 100.00                                             //   Бюджет мероприятия, числовое изменяемое

    var internet: Boolean = true                         //   Статус интернета, не совсем понял что это такое, но скорее всего интернет или есть или его нет
                                                         //   или
    var internet: Int = 0                                //   этот способ означает качество связи в диапазоне

    private lateinit var interaction: String             //   Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки

    lateinit var commands: Int = 0                       //   Количество команд, известно позже, зависит от количества участников, целое числовое

    private val tasks: String                            //   Перечень задач подготовлен заранее, приватный, строковый неизменяемый

    const val evacuationplan: String = "План эвакуации"  //   План эвакуации утвержден пожарной инспекцией задолго до хакатона, поэтому константа для события

    private val hardware = listOf("device 1", "device 2", "device 3")               //   Cписок оборудования по запросу через лист, постоянное строковое
                                                                                    //   или
    val hardware: String = "device 1", "device 2", "device 3"                       //   Cписок оборудования через строку, постоянное строковое

    var freehardware: String = "fdevice 1", "fdevice 2", "fdevice 3"                //   Cписок свободного оборудования через строку, изменяемое строковое




}

