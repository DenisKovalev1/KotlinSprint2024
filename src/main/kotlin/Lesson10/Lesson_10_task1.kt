package org.example.Lesson10

import kotlin.random.Random

fun main() {
    val numberUser = game()
    val numberPC = game()
    println("Счет Пользователя : $numberUser")
    println("Счет ПК : $numberPC")
    if (numberUser > numberPC) {
        println("Выйграл человек")
    } else if (numberUser == numberPC) {
        println("Нечья")
    } else println("Выйграла машина")
}

fun game(): Int = run { return Random.nextInt(1, 6) }