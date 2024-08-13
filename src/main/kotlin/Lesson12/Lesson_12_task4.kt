package org.example.Lesson12

fun main() {
    val monday = Day3(273, 254,false)
    val tuesday = Day3(290,300,true)
}
class Day3(_daytimeTemperature: Int, _nightTemperature: Int, _presenceOfPrecipitation: Boolean) {
    var daytimeTemperature = _daytimeTemperature
        get() = field - 273
    var nightTemperature = _nightTemperature
        get() = field - 273
    var presenceOfPrecipitation = _presenceOfPrecipitation
    init {
            println(
                """
          дневная температура: $daytimeTemperature
          ночная температура: $nightTemperature
          наличие осадков в течение суток $presenceOfPrecipitation
        """.trimIndent()
            )

    }

}