package org.example.Lesson6

fun main() {
    print("Введите количество секунд: ")
    val userCounter = readln().toLong()
    val counterSave = userCounter
    Thread.sleep(userCounter * 1000)
    println("Прошло $counterSave секунд")

}