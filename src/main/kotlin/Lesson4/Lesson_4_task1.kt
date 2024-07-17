package org.example.Lesson4

fun main() {
    val numberOfTables = 13
    val tableToday = 13
    val tableTomorrow = 9
    println("Доступность столов на сегодня: ${numberOfTables > tableToday} \n" +
            "Доступность столов на завтра: ${numberOfTables > tableTomorrow} ")
}