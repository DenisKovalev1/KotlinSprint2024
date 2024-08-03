package org.example.Lesson11

fun main() {
    val monday = Days()
    val tuesday = Days()
    monday.daytimeTemperature = 21
    monday.nightTemperature = 10
    println("Погода на понедельник")
    monday.outputInfo()
    tuesday.daytimeTemperature = 30
    tuesday.nightTemperature = 40
    tuesday.presenceOfPrecipitation = true
    println("Погода на вторник")
    tuesday.outputInfo()


}
class Days(){
    var daytimeTemperature = TEMPERATURE
    var nightTemperature = TEMPERATURE
    var presenceOfPrecipitation = false
    fun outputInfo (){
        println("""
          дневная температура: $daytimeTemperature
          ночная температура: $nightTemperature
          наличие осадков в течение суток $presenceOfPrecipitation
        """.trimIndent())
    }
}
const val TEMPERATURE = 0