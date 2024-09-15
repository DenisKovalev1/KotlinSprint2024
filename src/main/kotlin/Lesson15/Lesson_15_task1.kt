package org.example.Lesson15

fun main() {
    val duck = Duck()
    val carp = CrucianCarp()
    val seagull = Seagull()

    carp.moveSwimming()
    seagull.moveFlight()
    duck.moveSwimming()
    duck.moveFlight()
}

class CrucianCarp : Swimming {
    override fun moveSwimming() {
        println("Поплыл карась")
    }
}

class Seagull : Flight {
    override fun moveFlight() {
        println("Чайка полетела")
    }
}

class Duck : Swimming, Flight {
    override fun moveSwimming() {
        println("Поплыла утка")
    }

    override fun moveFlight() {
        println("Утка пошла на взлёт")
    }
}

interface Swimming {
    fun moveSwimming()
}

interface Flight {
    fun moveFlight()
}

