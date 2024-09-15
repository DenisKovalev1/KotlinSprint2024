package org.example.Lesson17

fun main() {
    val folder = Folders("Movie", 15, true)
    println(folder.name)
    folder.flagSecret = false
    println(folder.name)
}

class Folders(
    name: String,
    numberOfFiles: Int,
    var flagSecret: Boolean
) {
    val name = name
        get() = if (flagSecret) "Скрытая папка, Количество файлов - $numberOfFiles"
        else "$field, Количество файлов - $numberOfFiles"
    val numberOfFiles = numberOfFiles
        get() = if (flagSecret) 0 else field
}