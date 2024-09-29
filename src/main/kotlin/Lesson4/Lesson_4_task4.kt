package org.example.Lesson4

fun main() {
    val dayTraining = 2
    val isEvenDay: Boolean = (dayTraining % 2 != 0)

    println(
        """
       Упражнения для рук:    ${isEvenDay}
       Упражнения для ног:    ${!isEvenDay}
       Упражнения для спины:  ${!isEvenDay}
       Упражнения для пресса: ${isEvenDay}
    """.trimIndent()
    )
}