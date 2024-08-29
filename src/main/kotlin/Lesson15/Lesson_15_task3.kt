package org.example.Lesson15

fun main() {
    val user = User("Денис")
    val admin = Admin("Марина")
    user.printMessage()
    user.read()
    admin.read()
    admin.printMessage()
    admin.deleteMessage(user)
    admin.deleteUser(user)
}

abstract class Actions {
    abstract fun read()
    abstract fun printMessage()
}

class User(val name: String) : Actions() {
    override fun read() {
        println("$name Читает сообщение ")
    }

    override fun printMessage() {
        println("$name Печатает")
    }
}

class Admin(val nameAdmin: String) : Actions() {
    fun deleteUser(user: User) {
        println("Админ $nameAdmin удалил пользователя ${user.name} ")
    }

    fun deleteMessage(user: User) {
        println("Админ $nameAdmin удалил сообщения пользователя: ${user.name}")
    }

    override fun read() {
        println("Админ $nameAdmin читает")
    }

    override fun printMessage() {
        println("Админ $nameAdmin печатает")
    }
}