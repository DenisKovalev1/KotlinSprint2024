package org.example.Lesson15

fun main() {
    val user = SimpleUser("Денис")
    val admin = Admin("Марина")
    user.printMessage()
    user.read()
    admin.read()
    admin.printMessage()
    admin.deleteMessage(user)
    admin.deleteUser(user)
}

abstract class User(open val name: String) {
    abstract fun read()
    abstract fun printMessage()
}

class SimpleUser(name: String) : User(name = name) {
    override fun read() {
        println("$name Читает сообщение ")
    }

    override fun printMessage() {
        println("$name Печатает")
    }
}

class Admin(name: String) : User(name = name) {
    fun deleteUser(user: SimpleUser) {
        println("Админ $name удалил пользователя ${user.name} ")
    }

    fun deleteMessage(user: SimpleUser) {
        println("Админ $name удалил сообщения пользователя: ${user.name}")
    }

    override fun read() {
        println("Админ $name читает")
    }

    override fun printMessage() {
        println("Админ $name печатает")
    }
}