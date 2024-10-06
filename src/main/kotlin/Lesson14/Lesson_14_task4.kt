package org.example.Lesson14

fun main() {
    val deimos = Satellites("Деймос", false, false)
    val phobos = Satellites("Фобос", true, false)
    val mars = Planets("Марс", false, true, listOf(deimos, phobos))
    mars.info()
}

abstract class HeavenlyBodies(
    val name: String,
    val isAtmosphere: Boolean,
    val isDisembarkation: Boolean,
)

class Planets(name: String, isAtmosphere: Boolean, isDisembarkation: Boolean, val satellites: List<Satellites>) :
    HeavenlyBodies(name = name, isAtmosphere = isAtmosphere, isDisembarkation = isDisembarkation) {

    fun info() {
        println(
            "Небесное тело - $name ; Спутники $satellites)"
        )
    }
}

class Satellites(name: String, isAtmosphere: Boolean, isDisembarkation: Boolean) :
    HeavenlyBodies(name = name, isAtmosphere = isAtmosphere, isDisembarkation = isDisembarkation) {
    override fun toString(): String {
        return name
    }
}