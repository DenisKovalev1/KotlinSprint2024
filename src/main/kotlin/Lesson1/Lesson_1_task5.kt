package org.example.Lesson1

fun main() {
    fun timeSecondsToStr(seconds: Int): String {
        val hour = seconds / 3600
        val minute = (seconds % 3600) / 60
        val second = seconds % 60
        return String.format("%02d:%02d:%02d", hour, minute, second)

    }
    println("Время проведенное в космосе: ${timeSecondsToStr(TIME_IN_SPASE)}")
}
const val TIME_IN_SPASE = 6480