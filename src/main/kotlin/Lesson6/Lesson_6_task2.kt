package org.example.Lesson6

fun main() {
    print("Введите количество секунд: ")
    var userCounter = readln().toInt()
    val  counterSave = userCounter
    while (userCounter > 0){
        userCounter--
        Thread.sleep(1000)
    }
    println("Прошло $counterSave секунд")
}