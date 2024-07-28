package org.example.Lesson6

fun main() {
    var attempt = 5

    println("Угодай число от 0 до 9")
    println("Увас 5 попыток")
    do {

        val userNumber = readln().toInt()
        if (userNumber == SECRET_NUMBER) {
            println("Успех!!")
            break
        }
        attempt--
        println("Неверно. Попыток : $attempt")

    } while (attempt > 0)


}

const val SECRET_NUMBER = 3
