package org.example.Lesson10

fun main() {
    println("Введите длину пароля")
    val userRead = readln().toInt()
    println(getPassword(userRead).joinToString(""))
}

fun getPassword(lengthPassword: Int): List<String> {
    val listPassword: MutableList<String> = mutableListOf()
    val charRange = (' '..'/')
    val valueRange = (0..9)
    for (i in 1 .. lengthPassword) {
        if (i % 2 == 0) {
            listPassword.add(charRange.random().toString())
        } else {
            listPassword.add(valueRange.random().toString())
        }
    }
    return listPassword
}