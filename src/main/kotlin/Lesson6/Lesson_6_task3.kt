package org.example.Lesson6

fun main() {
    print("Введите количество секунд: ")
    var userCounter = readln().toInt()
    while (userCounter > 0){
        println("Осталось секунд: ${userCounter--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}