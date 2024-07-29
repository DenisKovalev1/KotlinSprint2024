package org.example.Lesson9

fun main() {
    val ingredientsList = mutableListOf("Яйцо", "Лук", "Помидор")
    println("В рецепте есть базовые ингредиенты:")
    ingredientsList.forEach { println(it) }
    println("Желаете добавить еще?")
    val userInput = readln()
    if (userInput == "Да") {
        println("Что добавить")
        val newUserInput = readln()
        ingredientsList.add(newUserInput)
        println("Теперь в рецепте есть следующие ингредиенты:")
        ingredientsList.forEach { println(it) }
    } else println("Goodbye")

}