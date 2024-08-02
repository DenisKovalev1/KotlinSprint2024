package org.example.Lesson10

fun main() {
    println("Введите длину пароля")
    val userRead = readln().toInt()
    println(getPassword(userRead).joinToString(""))
}

fun getPassword(lengthPassword: Int): List<Any> {
    val listPassword: MutableList<Any> = mutableListOf()
    val charRange = (' '..'/')
    val valueRange = (0..9)
    for (i in 1..lengthPassword / 2) {
        listPassword.add(charRange.random())
        listPassword.add(valueRange.random())

    }
return listPassword
}


