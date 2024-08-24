package org.example.Lesson2


fun main() {
    val departureHour = 9
    val departureMinutes = 39
    val departureTime = (departureHour * TIME) + departureMinutes
    val travelTime = 457
    val arrivalTime = departureTime + travelTime
    val arrivalHour = arrivalTime / TIME
    val arrivalMinutes = arrivalTime - (arrivalHour * TIME)
    println("Поезд прибудет в %02d:%02d".format(arrivalHour,arrivalMinutes))
}
const val TIME = 60
