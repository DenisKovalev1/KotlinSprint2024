package org.example.Lesson7

fun main() {
    println("Введите время таймера")
    val userValue = readln().toInt()
    for (i in userValue downTo  0){
        println("Таймер закончится  через: $i")
        Thread.sleep(1000)
        if (i == 1) {
            println("Время кончилось")
            break
        }
    }
}