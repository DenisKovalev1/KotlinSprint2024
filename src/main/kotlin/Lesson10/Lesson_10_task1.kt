package org.example.Lesson10

fun main() {
    val numberUser = game()
    val numberPC = game()
    println("Счет Пользователя : $numberUser")
    println("Счет ПК : $numberPC")
    if (numberUser > numberPC) {
        println("Выиграл человек")
    } else if (numberUser == numberPC) {
        println("Ничья")
    } else println("Выиграла машина")
}

fun game(): Int = run { return (1 .. 6).random() }