package org.example.Lesson7

fun main() {
    for (i in 1..3) {
        val charRange = ('a'..'z').random()
        val valueRange = (0..9).random()
        print("$charRange$valueRange")
    }
}