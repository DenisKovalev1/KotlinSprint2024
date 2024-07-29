package org.example.Lesson9

fun main() {
    val ingredientsList = listOf("Яйцо", "Лук", "Помидор", "Масло", "Бекон")
    println("В рецепте есть следующие ингредиенты:")
    ingredientsList.forEach { ingredients -> println(ingredients) }
}