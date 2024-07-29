package org.example.Lesson8

fun main() {
    val listIngredients = arrayOf("Яйцо", "Лук", "Помидор", "Масло", "Бекон")
    for (i in listIngredients) println("Ингредиент ${listIngredients.indexOf(i) + 1}: $i")
    println("Какой ингредиент вы хотите поменять?")
    val userInput = readln()
    if (listIngredients.contains(userInput)) {
        val getIndex = listIngredients.indexOf(userInput)
        println("На что его заменить?")
        val userInputNew = readln()
        listIngredients.set(getIndex, userInputNew)
        listIngredients.forEach {println("Ингредиент ${listIngredients.indexOf(it) + 1}: $it") }
    } else println("Такого нет")

}