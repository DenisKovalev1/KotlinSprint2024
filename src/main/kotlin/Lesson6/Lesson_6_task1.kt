package org.example.Lesson6

fun main() {
    println("Для реистрации укажите логин и пароль")
    print("Login: ")
    val userRegLogin = readln()
    print("Password: ")
    val userRegPassword = readLine()

    println("Для входа в аккаунт введите логин и пароль")
    do {
        print("Login: ")
        val userLogin = readLine()
        print("Password: ")
        val userPassword = readLine()
    } while (userRegLogin != userLogin || userRegPassword != userPassword)
    println("Авторизация прошла успешно")


}