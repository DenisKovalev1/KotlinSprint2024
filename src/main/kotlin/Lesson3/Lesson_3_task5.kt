package org.example.Lesson3

fun main() {
val parsing = PLAYER_MOVE.split("-",";")
    val fromWhere = parsing[0]
    val toWhere = parsing[1]
    val moveNumber = parsing[2]
    println(fromWhere)
    println(toWhere)
    println(moveNumber)
}
const val PLAYER_MOVE = "D2-D4;0"