package org.example.Lesson14

fun main() {
    val liner = LinerShip_2("Лайнер", 100, 200, 300)
    val cargo = CargoShip_2("Грузовой", 50, 500, 30)
    val icebreaker = IcebreakerShip_2("Ледокол", 10, 20, 5)
    liner.informationOutput()
    liner.loadingStart()
    println()
    cargo.informationOutput()
    cargo.loadingStart()
    println()
    icebreaker.informationOutput()
    icebreaker.loadingStart()
}

open class LinerShip_2(
    _name: String,
    _speed: Int,
    _liftingCapacity: Int,
    _capacity: Int,
    _icebreakerFun: Boolean = false,
) {
    val name = _name
    val speed = _speed
    val liftingCapacity = _liftingCapacity
    val capacity = _capacity
    val icebreakerFun = _icebreakerFun


    fun informationOutput() {
        println(
            """
           Название корабля: $name
           Скорость корабля: $speed
           Грузоподьемность: $liftingCapacity
           Вместительность: $capacity
           Ледокол - $icebreakerFun
        """.trimIndent()
        )
    }

    open fun loadingStart() {
        println("Выдвинуть горизонтальный трап со шкафута")
    }
}

class CargoShip_2(
    name: String,
    speed: Int,
    liftingCapacity: Int,
    capacity: Int,
) : LinerShip_2(name, speed, liftingCapacity, capacity) {
    override fun loadingStart() {
        println("Погрузочный кран активирован ")
    }
}

class IcebreakerShip_2(
    name: String,
    speed: Int,
    liftingCapacity: Int,
    capacity: Int,
    icebreakerFun: Boolean = true,
) : LinerShip_2(name, speed, liftingCapacity, capacity, icebreakerFun) {
    override fun loadingStart() {
        println("Открыть ворота со стороны кормы")
    }
}