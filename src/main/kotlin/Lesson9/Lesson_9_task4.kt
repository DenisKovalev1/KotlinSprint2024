package org.example.Lesson9

fun main() {
    println("Введите 5 ингредиентов через запятую")
    val listSortedIngredients = readln().split(", ").sorted()
    println(listSortedIngredients)
}
