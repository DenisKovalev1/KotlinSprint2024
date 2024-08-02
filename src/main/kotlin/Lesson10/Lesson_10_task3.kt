package org.example.Lesson10

fun main() {
    println("Введите длину пароля")
    val userRead = readln().toInt()
    getPassword(userRead)
}

fun getPassword(lengthPassword: Int) {
    val charRange: CharRange = (' '..'/')
    val valueRange = (0..9)
    for (i in 1..lengthPassword) {
        print("${charRange.random()}${valueRange.random()}")
    }
}


