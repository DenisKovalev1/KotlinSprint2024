package org.example.Lesson18

fun main() {
    val listBones: List<Bones> = listOf(Bone4(4), Bone6(6), Bone8(8))
    listBones.forEach { println(it.throwTheDice()) }
}

open class Bones(val edges: Int) {
    open fun throwTheDice(): String {
        return "Бросок $edges граней: ${(1..edges).random()}"
    }
}

class Bone4(edges: Int) : Bones(edges = edges)

class Bone6(edges: Int) : Bones(edges = edges)

class Bone8(edges: Int) : Bones(edges = edges)
