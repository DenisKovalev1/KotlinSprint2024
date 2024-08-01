package org.example.Lesson10

fun main() {
    println("Введите Логин и пароль")
    print("Login: ")
    val userLogin = readln()
    print("Password: ")
    val userPassword = readln()
    checkLength(userLogin, userPassword)
}

fun checkLength(userLogin: String, userPassword: String) {
    if (userLogin.length <= MIN_LENGTH || userPassword.length <= MIN_LENGTH) {
        println("Логин или пароль недостаточно длинные")
    } else println("Добро пожаловать.")
}

const val MIN_LENGTH = 4