package org.example.Lesson15

fun main() {
    val duck = Duck()
    val carp = CrucianCarp()
    val seagull = Seagull()

    carp.move()
    seagull.move()
    duck.move()
}

class CrucianCarp : MoveCrucianCarp {
    override fun move() {
        println("Поплыл карась")
    }
}


class Seagull : MoveSeagull {
    override fun move() {
        println("Чайка полетела")
    }
}

class Duck : MoveDuck {
    override fun move() {
        println("Утка поплыла и взлетела")
    }

}

interface MoveCrucianCarp {
    fun move()
}

interface MoveSeagull {
    fun move()
}

interface MoveDuck {
    fun move()
}