package org.example.Lesson13

fun main() {
    val users: List<telephoneDirectory2> = listOf(
        telephoneDirectory2(name = "Денис", telephone = 89997771324),
        telephoneDirectory2(name = "Марина", telephone = 98899229, company = null),
        telephoneDirectory2(name = "Олег", telephone = 988997656, company = null),
        telephoneDirectory2(name = "Кирилл", telephone = 98892345, company = "Apple"),
        telephoneDirectory2(name = "Максим", telephone = 988777777, company = "Apple"),
        telephoneDirectory2(name = "Максим", telephone = 988777777, company = "Магнит"),
        telephoneDirectory2(name = "Максим", telephone = 988777777, company = "Магнит"),
        telephoneDirectory2(name = "Максим", telephone = 988777777, company = "Samsung"),
    )
    val ListOfCompanies: MutableSet<String> = mutableSetOf()
    ListOfCompanies.addAll(users.mapNotNull { it.company })
    println("Список всех компаний")
    ListOfCompanies.forEach { println(it) }



}

class telephoneDirectory2(
    val name: String, val telephone: Long, val company: String? = "null",
) {
    fun informationOutput() {
        println("-Имя: $name \n-Номер: $telephone \n-Компания: $company")
        println()
    }
}