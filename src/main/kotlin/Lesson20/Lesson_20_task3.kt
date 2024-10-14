package org.example.Lesson20

fun main() {
    val player = Players999("Денис", true)
    val openTheDoor: (Players999) -> String =
        { player -> if (player.isKey) "Дверь открыта!" else "Дверь заперта" }
   println( openTheDoor(player))
}

class Players999(val name: String, val isKey: Boolean)