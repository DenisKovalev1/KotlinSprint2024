package org.example.Lesson19

fun main() {
    val test = Ship("Титаник")

}

class Ship(val name: String) {
    fun takeOff() {
        TODO("Доделать метод takeOff")
    }

    fun landing() {} // TODO Доделать метод landing
    fun shoot() = println("Пиу-пиу")
}
