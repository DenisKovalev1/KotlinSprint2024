package org.example.Lesson17

fun main() {
    val victorina = Victorina("Как меня зовут?", "Денис")
    println(victorina.question)
    println(victorina.answer)
}

class Victorina(
    question: String,
    answer: String,
) {
    var question = question
        get() = field
    var answer = answer
        get() = field
        set(value) {
            field = value
        }
}