package org.example.Lesson9

fun main() {
    println("Введите")
    val list = readln().split(", ")
   val seList = list.toSet()

    println(seList.toString().substring(1))
}