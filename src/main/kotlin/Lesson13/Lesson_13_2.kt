package org.example.Lesson13

fun main() {
    val user = telephoneDirectory1(name = "Денис", telephone = 89997771324)
    val user2 = telephoneDirectory1(name = "Марина", telephone = 98899229, company = "Apple")
    user.informationOutput()
    user2.informationOutput()
}

class telephoneDirectory1(
    val name: String, val telephone: Long, val company: String? = null,
) {
    fun informationOutput() {
        println("-Имя: $name \n-Номер: $telephone \n-Компания: ${company ?: "<не указано>"}")
    }
}