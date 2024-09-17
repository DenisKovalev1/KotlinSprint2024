package org.example.Lesson18

fun main() {
    val user = Shop(2)
    user.order("Картошка")
    user.order(listOf("Помидор", "Лук", "Капуста"))
}

class Shop(
var orderNumber: Int
) {
    fun order(product: String) {
        println("Номер заказа - ${orderNumber}. Заказан товар $product")
    }

    fun order(product: List<String>) {
        println("Номер заказа - ${orderNumber}. Заказаны товары $product")
    }
}