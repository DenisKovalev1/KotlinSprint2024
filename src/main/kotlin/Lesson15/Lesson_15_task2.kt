package org.example.Lesson15

fun main() {
    val server = WeatherServer()
    val temperature = Temperature(12)
    val amount = PrecipitationAmount(22)
    server.SendingRequest(temperature)
    server.SendingRequest(amount)
}

abstract class WeatherStationStats

class Temperature(val temperature: Int) : WeatherStationStats()

class PrecipitationAmount(val precipitationAmount: Int) : WeatherStationStats()

class WeatherServer {

    fun SendingRequest(stationStats: WeatherStationStats) = when (stationStats) {
        is Temperature -> println("Температура ${stationStats.temperature} градусов")
        is PrecipitationAmount -> println("Осадки сосставляют ${stationStats.precipitationAmount} % ")
        else -> println("Данные не корректны!")
    }

}