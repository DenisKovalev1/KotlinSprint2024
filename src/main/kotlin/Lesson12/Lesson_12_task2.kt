package org.example.Lesson12

fun main() {
    val monday = Day(0, 10,false)
    val tuesday = Day(30,20,true)
    monday.outputInfo()
    tuesday.outputInfo()
}
class Day(_daytimeTemperature: Int, _nightTemperature: Int, _presenceOfPrecipitation: Boolean ){
    var daytimeTemperature = _daytimeTemperature
    var nightTemperature = _nightTemperature
    var presenceOfPrecipitation = _presenceOfPrecipitation
    fun outputInfo (){
        println("""
          дневная температура: $daytimeTemperature
          ночная температура: $nightTemperature
          наличие осадков в течение суток $presenceOfPrecipitation
        """.trimIndent())
    }
}