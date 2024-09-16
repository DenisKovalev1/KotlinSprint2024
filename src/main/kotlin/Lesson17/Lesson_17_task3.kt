package org.example.Lesson17

fun main() {
    val folder = Folders("Movie", 15, true)
    println("${folder.name}, Количество файлов - ${folder.numberOfFiles}")
    folder.flagSecret = false
    println("${folder.name}, Количество файлов - ${folder.numberOfFiles}")
}

class Folders(
    name: String,
    numberOfFiles: Int,
    var flagSecret: Boolean
) {
    val name = name
        get() = if (flagSecret) "Скрытая папка"
        else field
    val numberOfFiles = numberOfFiles
        get() = if (flagSecret) 0 else field
}