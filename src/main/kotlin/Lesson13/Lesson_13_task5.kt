package org.example.Lesson13

fun main() {
    println("Введите Имя")
    val addUserName = readln()
    println("Введите номер")
    val addUserNumber = try {
        val inputUserNumber = readln().toLong()
    } catch (error: NumberFormatException) {
        println("Ошибка - ${error::class.simpleName}")
        println("Вы ввели не цифры")
    }
    println("Введите название компании")
    val addUserCompany = readln()
    val telephoneDirectory: MutableList<telephoneDirectory5> = mutableListOf()
    val usersContacts = telephoneDirectory5(addUserName, addUserNumber, addUserCompany)
    telephoneDirectory.addAll(listOf(usersContacts))
    telephoneDirectory.forEach { it.informationOutput() }
}

class telephoneDirectory5(
    val name: String, val telephone: Any, val company: String? = null,
) {
    fun informationOutput() {
        println("-Имя: $name \n-Номер: $telephone \n-Компания: $company")
    }
}