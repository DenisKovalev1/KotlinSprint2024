package org.example.Lesson4

fun main() {

    val tableToday = 13
    val tableTomorrow = 9
    println("Доступность столов на сегодня: ${NUMBER_OF_TABLES > tableToday} \n" +
            "Доступность столов на завтра: ${NUMBER_OF_TABLES > tableTomorrow} ")
}
const val NUMBER_OF_TABLES = 13