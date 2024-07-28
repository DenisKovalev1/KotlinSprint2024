package org.example.Lesson5

import kotlin.random.Random

fun main() {
    println("Нужно угадать 3 числа от 0 до 42")
    val randomValues = List(3) { Random.nextInt(0, 42) }
    val userValues: MutableList<Int> = mutableListOf()
    val userNumber = readln()
    userValues.add(userNumber.toInt())
    val userNumber1 = readln()
    userValues.add(userNumber1.toInt())
    val userNumber2 = readln()
    userValues.add(userNumber2.toInt())


    val coincidence = randomValues.intersect(userValues).size
    println("Проверяем...")
    Thread.sleep(3000)

    when {
        coincidence == 1 -> println("Угадано одно число, пользователю выплачивается утешительный приз.")
        coincidence == 2 -> println("Угадали два числа и получаете крупный приз")
        coincidence == 3 -> println("Угадали все числа и выиграли джекпот")
        else -> println("Не одно число не угадано")
    }
    println("Выигрышные числа")
    for (winValues in randomValues)
        println(winValues)

}