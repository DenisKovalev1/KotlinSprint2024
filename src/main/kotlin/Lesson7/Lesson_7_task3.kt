package org.example.Lesson7

fun main() {
    print("Введите число ")
    val userValue = readln().toInt()
    for (i in 0..userValue step 2){
        println(i)}
}