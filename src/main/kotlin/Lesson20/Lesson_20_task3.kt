package org.example.Lesson20

fun main() {
    val player = Players999("Денис", true)
    val openTheDoor: (Players999) -> Unit =
        fun(player: Players999) { if (player.isKey) println("Дверь открыта!") else println("Дверь заперта") }
    openTheDoor(player)
}

class Players999(val name: String, val isKey: Boolean)