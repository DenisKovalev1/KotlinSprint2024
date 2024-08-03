package org.example.Lesson9

fun main() {
    val ingredientsMap = mapOf(2 to "Яйцо", 50 to "Молоко", 15 to "Сливочное масло")
    println("Укажите количество порций")
    val userNumber = readln().toInt()
    println("Для $userNumber порций вам понадобится: ")
    ingredientsMap.forEach{ elemet -> println("${elemet.value} - ${elemet.key * userNumber} ") }
}