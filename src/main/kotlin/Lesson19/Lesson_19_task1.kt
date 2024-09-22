package org.example.Lesson19

fun main() {
    println(Fish.entries.joinToString(", "))
}

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESEFIGHTINGFISH,
}