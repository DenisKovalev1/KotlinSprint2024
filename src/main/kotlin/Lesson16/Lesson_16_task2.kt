package org.example.Lesson16

import kotlin.math.pow

fun main() {
    val circle = Circle(3.0)
    println("Длина окружности состовляет: ${circle.calculateTheCircumference()}")
    println("Площадь круга состовляет: ${circle.calculateTheAreaOfACircle()}")
}

class Circle(private val radius: Double) {

    fun calculateTheCircumference(): Double = 2 * PI * radius

    fun calculateTheAreaOfACircle(): Double = PI * radius.pow(2)
}

private const val PI = 3.14