package org.example.Lesson17

fun main() {
    val parcels = Parcels(1, "Краснодар")
    println(parcels.movementCounter)
    parcels.location = "Кемерово"
    println(parcels.movementCounter)
    parcels.location = "Москва"
    println(parcels.movementCounter)
}

class Parcels(
    number: Int,
    location: String,
) {
    var movementCounter = 0
    var location = location
        set(value) {
            movementCounter++
        }
}