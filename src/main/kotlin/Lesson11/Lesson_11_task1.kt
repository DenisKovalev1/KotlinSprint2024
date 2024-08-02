package org.example.Lesson11

fun main() {

    val denis = User(
        id = 1,
        login = "terminator9000",
        password = "9854",
        eMail = "bum@gmail,com"
    )
    val marina = User(
        id = 2,
        login = "Nagibator2000",
        password = "0000",
        eMail = "kuku@mail.com"
    )
    println("Идентификатор: ${denis.id}")
    println("Логин: ${denis.login}")
    println("Пароль: ${denis.password}")
    println("еМаил: ${denis.eMail}")
    println()
    println("Идентификатор: ${marina.id}")
    println("Логин: ${marina.login}")
    println("Пароль: ${marina.password}")
    println("еМаил: ${marina.eMail}")
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val eMail: String,
)