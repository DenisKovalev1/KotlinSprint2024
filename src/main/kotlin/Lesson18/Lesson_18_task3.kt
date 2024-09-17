package org.example.Lesson18

fun main() {
    val stringList: List<Animal> = listOf(
        Fox("Лиса", "Ягода"), Dog("Собака", "Кости"),
        Cat("Кошка", "Рыба")
    )
    stringList.forEach { it.eat(it.name, it.food) }
    stringList.forEach { it.sleep() }
}

abstract class Animal(val name: String, val food: String) {
    abstract fun eat(name: String, eat: String)
     fun sleep () = println("$name спит")
}

class Fox(name: String, food: String) : Animal(name = name, food = food) {

    override fun eat(name: String, eat: String) {
        println("$name кушает $eat")
    }
}

class Dog(name: String, food: String) : Animal(name = name, food = food) {
    override fun eat(name: String, eat: String) {
        println("$name кушает $eat")
    }
}

class Cat(name: String, food: String) : Animal(name = name, food = food) {
    override fun eat(name: String, eat: String) {
        println("$name кушает $eat")
    }
}