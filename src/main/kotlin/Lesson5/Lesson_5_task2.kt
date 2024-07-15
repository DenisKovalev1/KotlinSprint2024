package org.example.Lesson5

fun main() {
    print("Для входа в приложение введите год своего рождения: ")
    val userAge = readln().toInt()
    val thisYear = 2024
    val age = thisYear - userAge

    if (age >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом!")
    }
    if (age < AGE_OF_MAJORITY){
        println("Доступ запрещен!!!")
        println("Вернутся на главную страницу")
    }


}

const val AGE_OF_MAJORITY = 18