package org.example.Lesson18

fun main() {
    val listBones: List<Bones> = listOf(Bone4(), Bone6(), Bone8())
    listBones.forEach { println(it.throwTheDice()) }
}

open class Bones() {
    open fun throwTheDice() = ""
}

class Bone4() : Bones() {
    override fun throwTheDice(): String {
        return "Бросок 4 граней: ${(1..4).random()}"
    }
}

class Bone6() : Bones() {
    override fun throwTheDice(): String {
        return "Бросок 6 граней: ${(1..6).random()}"
    }
}

class Bone8() : Bones() {
    override fun throwTheDice(): String {
        return "Бросок 8 граней: ${(1..8).random()}"
    }
}