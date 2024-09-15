package org.example.Lesson16

fun main() {
val cube = Cube()
    cube.getNumber()
}

class Cube() {
    private val number = (1..6).random()
    fun getNumber() {
        println(number)
    }
}