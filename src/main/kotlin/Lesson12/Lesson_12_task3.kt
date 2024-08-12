package org.example.Lesson12

fun main() {
    val monday = Day2(273, 254,false)
    val tuesday = Day2(290,300,true)
    monday.outputInfo()
    tuesday.outputInfo()

}

class Day2(_daytimeTemperature: Int, _nightTemperature: Int, _presenceOfPrecipitation: Boolean) {
    var daytimeTemperature = _daytimeTemperature
        get() = field - 273
    var nightTemperature = _nightTemperature
        get() = field - 273
    var presenceOfPrecipitation = _presenceOfPrecipitation
    fun outputInfo() {
        println(
            """
          дневная температура: $daytimeTemperature
          ночная температура: $nightTemperature
          наличие осадков в течение суток $presenceOfPrecipitation
        """.trimIndent()
        )
    }
}