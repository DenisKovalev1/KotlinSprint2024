package org.example.Lesson16

fun main() {
    val order = Order(1, true)

    fun changeStatus(status: String) {
        if (status == "Готово") {
            order.getStatus(true)
        } else if (status == "Не готово") {
            order.getStatus(false)
        }
    }
    changeStatus("Не готово")
}

class Order(private val number: Int, private var status: Boolean) {
    fun getStatus(status: Boolean) {
        this.status = status
    }
}
