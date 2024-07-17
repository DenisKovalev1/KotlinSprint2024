package org.example.Lesson5

// Heart of Gold
fun main() {
    println(
        """
    Внимание, пассажир. Моя обязанность, как обычно, незавидная, 
    - приветствовать вас на борту корабля "Heart of Gold". 
    Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.
""".trimIndent()
    )
    print("Login: ")
    val userReadName = readln()
    val userName = "Zaphod"
    val userPassword = "PanGalactic"
    if (userReadName == userName) {
        print("Введите свой пароль: ")
        val userRaedPass = readln()
        if (userRaedPass == userPassword) {
            println("Добро пожаловать в систему: $userReadName")
        }
    } else println("Ползователь не найден, пройдите регистрацию. ")


}
