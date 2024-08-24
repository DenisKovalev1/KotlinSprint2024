package org.example.Lesson6

fun main() {
    var attempt = 3
    println("Для входа решите один пример, у вас 3 попытки")
    do {
        val firstSyllable = (0..9).random()
        val secondSyllable = (0..9).random()
        print("$firstSyllable + $secondSyllable = ")
        val sum = firstSyllable + secondSyllable
        val userInput = readln().toInt()
        if (userInput == sum) {
            println("Добро пожаловать")
            break
        } else if (attempt > 1) {
            println("Не верно, осталось попыток - ${attempt- 1}")
        }
        attempt--
    } while (attempt > 0)
    if (attempt == 0) println("Доступ закрыт")


}
