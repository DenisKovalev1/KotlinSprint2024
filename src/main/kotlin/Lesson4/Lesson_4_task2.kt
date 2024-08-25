package org.example.Lesson4

fun main() {
    var userKilogram = 20
    var userLiters = 80
    println(
        "Груз с весом $userKilogram кг и объемом $userLiters л соответствует категории 'Average': " +
                "${AVERAGE_KG_MIN < userKilogram && AVERAGE_KG_MAX >= userKilogram && AVERAGE_LITERS > userLiters}"
    )
    userKilogram = 50
    userLiters = 100
    println(
        "Груз с весом $userKilogram кг и объемом $userLiters л соответствует категории 'Average': " +
                "${AVERAGE_KG_MIN < userKilogram && AVERAGE_KG_MAX <= userKilogram && AVERAGE_LITERS > userLiters}"
    )
}

const val AVERAGE_KG_MIN = 35
const val AVERAGE_KG_MAX = 100
const val AVERAGE_LITERS = 100