package org.example.Lesson2

import kotlin.math.pow

fun main() {
    val depositAmount = 70000
    val interestRate = 16.7
    val depositTerm = 20
    val compoundInterest = depositAmount * (1 + interestRate / 100).pow(depositTerm)
    println(String.format("%.3f", compoundInterest))
}
