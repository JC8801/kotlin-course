package com.aetherlyssa.kotlincourse

val name: String = "Yakov"          // постоянное значение

var age: Int = 36                   // переменное значение

const val PI = 3.14                 // постоянное значение для всего проекта, глобальная постоянная

lateinit var userinfo: String       // способ задания, не переменная, поздняя инициализация, всегда var

val lazyValue: String by lazy {                     // ленивая инициализация, инициализируется значением внутри скобок
    "Hallo, this is a lazy string"                  // только тогда, когда мы обращаемся к этой переменной
}

var speed: Double? = null           // ничего не понятно, потом пойму

var count: Int = 0
    get() = field                   // field - фактическое хранилище значения, недоступное напрямую, специально зарезервированное слово внутрни get и set
    set(value) {
        if (value >= 0) field = value
    }

val numberauto: String = "030DIM10" // номер авто - неизменяемое строковое значение
var color: String = "black"         // цвет авто - изменяемое строковое значение
var carmileage1: Int = 5000         // пробег авто - целое числовое значение
var carmileage2: Double = 0.00      // пробег авто - дробное число с плавающей запятой двойной точности
lateinit var owner: String
const val WHEELS: Int = 4
val report: String by lazy {

}
var fuel: Double = 0.00             // ничего не понятно, но очень интересно
    get() = field
    set(value) = {
        if (value > 0), field + value
    }

Домашнее задание 4

https://docs.google.com/document/d/1T4LR71BLS9FSb6-zaTaOixGmEiyneqX7g_AQA38Gx9U/edit?usp=sharing

Домашнее задание 5

Домашнее задание оформляем в ветке master в пакете lesson5

https://docs.google.com/document/d/1ElZbppB6xMW5B3GTOkKPhRGwxIajc4uKXNrknrDMnhM/edit?usp=sharing

Домашнее задание 6

Домашнее задание оформляем в ветке master в пакете lesson6

https://docs.google.com/document/d/1AOg6BUNSQLLFEw4FIk7J1YL13z9rDIssqtchfEO9jyU/edit?usp=sharing

Домашнее задание 7

Домашнее задание оформляем в ветке master в пакете lesson7

https://docs.google.com/document/d/1-603DXaieclX5N48rWtIKZY7CvBA_T6OIP6YPUHGNX8/edit?usp=sharing

Домашнее задание 8

Домашнее задание оформляем в ветке master в пакете lesson8

Тот монстр, кто сделает все дополнительные задания включая таблицу умножения в расширенном варианте получает право пройти на лайвкодинг мимо голосования (для демонстрации этой части домашки)

https://docs.google.com/document/d/1KTko0aa4D3m3fqLTRDpNWcr7ph8tRm3DKlpYxgcCKfU/edit?usp=sharing
