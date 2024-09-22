package org.example.Lesson13

fun main() {
    val telephoneDirectory: MutableList<telephoneDirectory3> = mutableListOf()
    do {
        println("Введите Имя")
        val addUserName = readln()
        println("Введите номер")
        val addUserNumber = readln().toLongOrNull() ?: return println("Без номера запись не добавить!")
        println("Введите название компании")
        val addUserCompany = readln()
        telephoneDirectory.add(telephoneDirectory3(addUserName, addUserNumber, addUserCompany))
        println("Довавить еще номер?")
        val userInput = readln().lowercase()
    } while (userInput == "да")
    println("В телефонной книге ${telephoneDirectory.size} пользователя")
    telephoneDirectory.forEach { it.informationOutput() }
}

class telephoneDirectory3(
    val name: String, val telephone: Long?, val company: String? = null,
) {
    fun informationOutput() {
        println("-Имя: $name \n-Номер: $telephone \n-Компания: $company \n-----")
    }
}