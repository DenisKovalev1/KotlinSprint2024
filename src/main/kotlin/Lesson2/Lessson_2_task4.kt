package org.example.Lesson2

fun main() {
    val buff = 20f
    val cristalOre = 7f
    val ironOre = 11f
    val cristalBuff = (buff / 100 * cristalOre).toInt()
    val ironBuff = (buff / 100 * ironOre).toInt()
    println("Вы получили бафф на кристаллическую руду: $cristalBuff")
    println("Вы получили бафф на железную руду: $ironBuff")
}