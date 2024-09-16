package org.example.Lesson17

fun main() {
    val ship = Ship("Жемчужина", 100, "Луна")
    println(ship.name)
    ship.name = "Ракета"
}

class Ship(
    name: String,
    speed: Int,
    port: String,
) {
    var name = name
        set(value) = println("У вас нет прав")
}