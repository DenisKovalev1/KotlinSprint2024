package org.example.Lesson16

fun main() {
    val user = User("aaa999", "Denis")
    println("Добрый день ${user.login}. Введите ваш пароль для проверки")
    val userInputPassword = readln()
    println("Результат проверки: ${user.checkPassword(userInputPassword)}")
}

class User(
    private val password: String,
    val login: String
) {

    fun checkPassword(userInput: String): Boolean = userInput == password
}