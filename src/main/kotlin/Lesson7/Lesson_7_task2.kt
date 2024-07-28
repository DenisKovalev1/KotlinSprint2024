package org.example.Lesson7

fun main() {

    val valueRange = (1000..9999)
    println("Вам был выслан пароль, введите его ниже")
    for (i in 0..100) {
        val password = valueRange.random()
        println(password)
        val userPass = readln().toInt()
        if (password == userPass) {
            println("Добро пожаловать")
            break
        } else {
            println("Не верно, вот новый пароль")
        }
    }

}