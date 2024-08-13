package org.example.Lesson12

fun main() {
    val monday = Day(0, 10,false)
    val tuesday = Day(30,20,true)
    monday.outputInfo()
    tuesday.outputInfo()
}
class Day(var daytimeTemperature: Int, var nightTemperature: Int, var presenceOfPrecipitation: Boolean,){
    fun outputInfo (){
        println("""
          дневная температура: $daytimeTemperature
          ночная температура: $nightTemperature
          наличие осадков в течение суток $presenceOfPrecipitation
        """.trimIndent())
    }
}