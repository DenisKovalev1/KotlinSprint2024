package org.example.Lesson19

fun main() {
    val tank = Tank("Т-90")
    tank.shot(Ammo.BLUE)
    tank.shot(Ammo.GREEN)
    tank.shot(Ammo.RED)
}

class Tank(val name: String) {
    fun shot(ammo: Ammo) {
        println("Выстрел! нанесено  ${ammo.damage} урона.")
    }
}

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(15)
}