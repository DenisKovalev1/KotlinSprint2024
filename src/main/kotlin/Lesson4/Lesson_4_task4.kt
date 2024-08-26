package org.example.Lesson4

fun main() {
    val dayTraining = 2
    val handExercises: Boolean = (dayTraining % 2 != 0)
    val legExercises: Boolean = (dayTraining % 2 == 0)
    val backExercises: Boolean = (dayTraining % 2 == 0)
    val abExercises: Boolean = (dayTraining % 2 != 0)
    println("""
       Упражнения для рук:    $handExercises
       Упражнения для ног:    $legExercises
       Упражнения для спины:  $backExercises
       Упражнения для пресса: $abExercises
    """.trimIndent())

}