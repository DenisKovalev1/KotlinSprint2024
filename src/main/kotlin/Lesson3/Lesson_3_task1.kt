package org.example.Lesson3

fun main() {
    val username = "Денис Ковалёв"
    val daytimeHello = "Добрый день "
    val nightHello = "Доброй ночи "
    var startingMessage = daytimeHello + username
    println(startingMessage)
    startingMessage = nightHello + username
    println(startingMessage)
}