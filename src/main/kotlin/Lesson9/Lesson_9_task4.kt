package org.example.Lesson9

fun main() {
    val listIngredients: MutableList<String> = mutableListOf()
    println("Введите 5 ингредиентов через запятую")
    val userInput = readln().split(", ")
    listIngredients.addAll(userInput)
    val listSortedIngredients = listIngredients.sorted()
    println(listSortedIngredients)

}
