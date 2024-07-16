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
    val red = readln()
    val userName = "Zaphod"
    val userPassword = "PanGalactic"
    if (red == userName){
        println("Добро пожаловать Zaphod, введите свой пароль")
        val redPass = readln()
        if (redPass == userPassword){
            println("Добро пожаловать в систему")
        }
    }

}
