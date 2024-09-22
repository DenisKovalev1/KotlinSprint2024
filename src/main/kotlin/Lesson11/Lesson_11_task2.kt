package org.example.Lesson11

fun main() {
    val denis = User2(
        id = 1,
        login = "Denis",
        password = "0000",
        eMail = "sobakd@mail.ru",
    )
    denis.displayInformation()
    println("Введите данные о себе")
    denis.entryInBio()
    denis.changePassword()
    println("Информация обновлена")
    denis.displayInformation()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val eMail: String,
    var bio: String = "<нет информации>",
) {
    fun displayInformation() {
        println(
            """
        Идентификатор: $id 
        Логин: $login
        Пароль: $password
        еМаил: $eMail
        Биография: $bio
    """.trimIndent()
        )
    }

    fun entryInBio() {
        bio = readln()
    }

    fun changePassword() {
        println("Для изменения пароля введите старый")
        val inputPassword = readln()
        if (inputPassword == password) {
            println("Введите новый пароль")
            password = readln()
            println("Пароль успешно изменен.")
        } else println("Не верный пароль")
    }
}