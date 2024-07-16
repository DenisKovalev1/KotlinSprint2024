package org.example.Lesson5

fun main() {
    val number1 = 11
    val number2 = 35
    println("Нужно угадать 2 числа от 0 до 42.")
    print("Введите первое число: ")
    val userNumber1 = readln().toInt()
    print("Введите второе число: ")
    val userNumber2 = readln().toInt()
    if (userNumber1 == number1 && userNumber2 == number2 ||
        userNumber1 == number2 && userNumber2 == number1
    ) {
        println("Вы получаете главный приз!!")
    } else if (userNumber1 != number1 && userNumber2 == number1 ||
        userNumber1 == number2 && userNumber2 != number2 ||
        userNumber1 == number1 && userNumber2 != number1 ||
        userNumber1 != number1 && userNumber2 == number2
    ) {
        println("Вы угадали одно числo!")
    } else {
        println("Вы проиграли... Нужные числа $number1 и $number2")
    }
}