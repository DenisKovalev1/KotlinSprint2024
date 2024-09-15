package org.example.Lesson17

fun main() {
    val user = Users("Денис", "000")
    println(user.password)
    user.password = "111"
    user.login = "Марина"
}

class Users(
    login: String,
    passwords: String,
) {
    var login = login
        set(value) {
            field = value
            println("Логин успешно изменен")
        }
    var password = passwords
        set(value) = println("Вы не можете изменить пароль")
        get() = "*".repeat(field.length)
}