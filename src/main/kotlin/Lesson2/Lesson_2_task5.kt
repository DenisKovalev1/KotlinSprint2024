package org.example.Lesson2

import kotlin.math.pow

fun main() {
val compoundInterest = DEPOSIT_AMOUNT * (1 + INTEREST_RATE / 100).pow(DEPOSIT_TERM)
    println(String.format("%.3f", compoundInterest))
}
const val DEPOSIT_AMOUNT = 70000
const val INTEREST_RATE = 16.7
const val DEPOSIT_TERM = 20.0