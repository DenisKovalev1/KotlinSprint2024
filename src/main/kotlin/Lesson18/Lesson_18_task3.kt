package org.example.Lesson18

fun main() {
    val stringList: List<Animal> = listOf(
        Fox("Лиса", "Ягода"), Dog("Собака", "Кости"),
        Cat("Кошка", "Рыба")
    )
    stringList.forEach { it.move(it.name, it.eat) }
}

abstract class Animal(val name: String, val eat: String) {
    abstract fun move(name: String, eat: String)
}

class Fox(name: String, eat: String) : Animal(name = name, eat = eat) {

    override fun move(name: String, eat: String) {
        println("$name кушает $eat")
    }
}

class Dog(name: String, eat: String) : Animal(name = name, eat = eat) {
    override fun move(name: String, eat: String) {
        println("$name кушает $eat")
    }
}

class Cat(name: String, eat: String) : Animal(name = name, eat = eat) {
    override fun move(name: String, eat: String) {
        println("$name кушает $eat")
    }
}