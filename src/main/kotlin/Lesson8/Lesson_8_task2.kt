package org.example.Lesson8

fun main() {
    val listIngredients = arrayOf("Яйцо", "Лук", "Помидор", "Масло", "Бекон")
    println("Какой ингредиент вас интересует?")
    val userInput = readln()

    for (ingredient in listIngredients){
        if (ingredient == userInput){
            return println("Ингредиент $ingredient в рецепте есть ")
        }
    }
    println("Такого нет)")
}