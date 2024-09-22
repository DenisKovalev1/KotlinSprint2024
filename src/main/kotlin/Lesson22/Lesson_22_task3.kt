package org.example.Lesson22

fun main() {
    val user = Users("Денис", "Ковалёв", 33)
    val (name, surname, age) = user
    println(name)
    println(surname)
    println(age)
}

data class Users(val name: String, val surname: String, val age: Int)