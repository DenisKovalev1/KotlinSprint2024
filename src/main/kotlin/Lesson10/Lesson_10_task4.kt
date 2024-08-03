package org.example.Lesson10

fun main() {
    var playerAccoun = PLAYER_NUMBER
    do {
        playerAccoun += diceGame()
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val userChoice = readln().lowercase()
        if (userChoice == "нет") {
            println("Количество выигранных раундов = $playerAccoun")
            println("До встречи")
        }
    } while (userChoice == "да")

}

fun newGame(): Int = run { return (1..6).random() }
fun diceGame(): Int {
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
const val PLAYER_NUMBER = 0