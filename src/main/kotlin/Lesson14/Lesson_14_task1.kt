package org.example.Lesson14

fun main() {

    val liner = LinerShip("Лайнер", 100,200,300)
    val cargo = CargoShip("Грузовой", 50, 500, 30)
    val icebreaker = IcebreakerShip("Ледокол", 10,20,5)

}

open class LinerShip(
    name: String,
    speed: Int,
    liftingCapacity: Int,
    capacity: Int,
    icebreakerFun: Boolean = false,)

class CargoShip(
    name: String,
    speed: Int,
    liftingCapacity: Int,
    capacity: Int,
) : LinerShip(name, speed, liftingCapacity, capacity)

class IcebreakerShip(
    name: String,
    speed: Int,
    liftingCapacity: Int,
    capacity: Int,
    icebreakerFun: Boolean = true,
) : LinerShip(name, speed, liftingCapacity, capacity, icebreakerFun)