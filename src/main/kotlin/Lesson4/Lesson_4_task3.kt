package org.example.Lesson4

fun main() {
    val presenceOfSunnyWeather: Boolean = true
    val openAwning: Boolean = true
    val airHumidityIs: Int = 20
    val currentTimeOfYear: String = "Не зима"

    val weatherToday: Boolean = true
    val awningAtTheMoment: Boolean = true
    val airHumidity: Int = 20
    val currentTimeOfYearNow: String = "Зима"

    val favorableConditions = (presenceOfSunnyWeather == weatherToday && openAwning == awningAtTheMoment
            && airHumidityIs == airHumidity && currentTimeOfYear == currentTimeOfYearNow)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}
