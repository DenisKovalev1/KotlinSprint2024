package org.example.Lesson10

fun main() {

    val listNumberWin: MutableList<Int> = mutableListOf()

    do {
        listNumberWin.add(game1())
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val userChoice = readln().lowercase()
        if (userChoice == "нет") {
            println("Количество выигранных раундов = ${listNumberWin.sum()}")
            println("До встречи")
        }
    } while (userChoice == "да")

}

fun newGame(): Int = run { return (1..6).random() }
fun game1(): Int {
    val userStep = newGame()
    val pcStep = newGame()
    println("Счет Человека : $userStep")
    println("Счет ПК : $pcStep")
    var number = START_NUMBER
    if (userStep > pcStep) {
        println("Выиграл Человек")
        number++
    } else if (userStep == pcStep) {
        println("Ничья")
    } else {
        println("Выиграла машина")
    }
    return number
}

const val START_NUMBER = 0