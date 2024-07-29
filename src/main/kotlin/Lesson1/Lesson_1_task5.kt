package org.example.Lesson1

fun main() {
    fun timeSecondsToStr(seconds: Int): String {
        val hour = seconds / TIME_MIN
        val minute = (seconds % TIME_MIN) / TIME_HOUR
        val second = seconds % TIME_HOUR
        return String.format("%02d:%02d:%02d", hour, minute, second)

    }
    println("Время проведенное в космосе: ${timeSecondsToStr(TIME_IN_SPASE)}")
}
const val TIME_IN_SPASE = 6480
const val TIME_MIN = 3600
const val TIME_HOUR = 60