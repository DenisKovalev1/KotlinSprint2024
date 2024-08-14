package org.example.Lesson13

fun main() {
    val user = telephoneDirectory(name = "Денис", telephone = 89997771324, company = null)
}

class telephoneDirectory(
    val name: String, val telephone: Long, val company: String?,
) {
}