package org.example.Lesson16

fun main() {
    val user = User()
    println("Добрый день ${user.login}. Введите ваш пароль для проверки")
    val userInputPassword = readLine()
    println("Результат проверки: ${user.validation(userInputPassword)}")
}

class User() {
    private val password = "aaa999aaa"
    val login = "Denis"

    fun validation(userInput: String?): Boolean = if (userInput == password) {
        true
    } else false
}