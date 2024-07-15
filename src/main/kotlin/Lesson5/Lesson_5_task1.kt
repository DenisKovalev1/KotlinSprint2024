package org.example.Lesson5

fun main() {
    val numberSum = 5
    println("Для входа в приложение нужно пройти капчу")
    print("Для этого  решите пример 2 + 3 =  ")
    val userNumber = readln().toInt()
    if (userNumber == numberSum){
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!!!")
    }
}