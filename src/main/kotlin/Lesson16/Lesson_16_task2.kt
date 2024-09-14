package org.example.Lesson16

fun main() {
    val circle = Circle(3)
    println("Длина окружности состовляет: ${circle.circumference()}")
    println("Площадь круга состовляет: ${circle.areaOfACircle()}")
}

class Circle(private val radius: Int) {

    protected val pi = 3.14

    fun circumference(): Double {
        val perimeter = 2 * pi * radius
        return perimeter
    }

    fun areaOfACircle(): Double {
        val diameter = radius * radius
        val circle = pi * diameter
        return circle
    }
}