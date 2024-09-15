package org.example.Lesson18

fun main() {
    val user = Shop()
    user.order("Картошка")
    user.order(listOf("Помидор", "Лук", "Капуста"))
}

class Shop(

) {
    fun order(product: String) {
        println("Заказан товар $product")
    }

    fun order(product: List<String>) {
        println("Заказаны товары $product")
    }
}