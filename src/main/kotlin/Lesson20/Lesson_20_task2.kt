package org.example.Lesson20

fun main() {
    val player = Players("Денис", 39, 100)
    val treatment: (Players) -> Unit = { it.health = it.maxHealth }
    println("Игрок ${player.name}, Здоровье = ${player.health}")
    println("${player.name} выпивает зелье ")
    treatment(player)
    println("Игрок ${player.name}, Здоровье = ${player.health}")
}

class Players(
    val name: String,
    var health: Int,
    val maxHealth: Int,
)

