package org.example.Lesson5

fun main() {
    val firstNumber = 2
    val secondNumber = 3
    val numberSum = firstNumber + secondNumber
    println("Для входа в приложение нужно пройти капчу")
    print("Для этого  решите пример 2 + 3 =  ")
    val userNumber = readln().toInt()
    if (userNumber == numberSum){
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!!!")
    }
}