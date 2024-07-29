package org.example.Lesson8

fun main() {
    val listIngredients = arrayOf("Яйцо", "Лук", "Помидор", "Масло", "Бекон")
    println("Какой ингредиент вас интересует?")
    val userInput = readln()
    if (userInput in listIngredients){
        println("Ингредиент $userInput в рецепте есть")
    }else println("Такого нет")
}