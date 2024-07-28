package org.example.Lesson7

fun main() {
    val charRange = ('a'..'z')
    val valueRange = (0..9)
    for (i in 1..3) {
        print("${charRange.random()}${valueRange.random()}")
    }
}