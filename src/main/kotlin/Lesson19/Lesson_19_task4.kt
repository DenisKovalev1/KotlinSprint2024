package org.example.Lesson19

fun main() {
    val tank = Tank("Т-90", null)
    tank.shot()
    tank.recharge(Ammo.RED)
    tank.shot()
}

class Tank(val name: String, var bullet: Ammo?) {
    fun recharge(ammo: Ammo) {
        this.bullet = ammo
        println("Заряжен патрон ${ammo}")
    }

    fun shot() {
        if (bullet != null){
        println("Выстрел! нанесено  ${bullet?.damage} урона.")
        } else println("Снаряд не заряжен!")
    }
}

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(15)
}