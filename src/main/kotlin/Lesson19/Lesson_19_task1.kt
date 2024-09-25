package org.example.Lesson19

fun main() {
    Fish.entries.forEach { println(it.nameFish) }
}

enum class Fish(var nameFish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESEFIGHTINGFISH("Петушок"),
}