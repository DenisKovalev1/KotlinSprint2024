package org.example.Lesson20

fun main() {
    println("Ваше имя?")
    val userName = readln()
    val lambda: (string: String) -> Unit = { println("С наступающим Новым Годом. $it") }
    lambda(userName)
}