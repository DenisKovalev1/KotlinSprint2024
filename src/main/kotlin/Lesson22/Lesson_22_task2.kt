package org.example.Lesson22

fun main() {
    val book = RegularBook2("Властелин колец", "Толкин, Джон Рональд Руэл")
    val book1 = DataBook2("Властелин колец", "Толкин, Джон Рональд Руэл")
    println(book)
    println(book1)
}

class RegularBook2(
    val name: String,
    val author: String,
)
//{
//  override fun toString(): String {
//    return "RegularBook2(name='$name', author='$author')"
// }
//} Можно переопределить метод toString в обычный класс. И сделать вывод читабельным


data class DataBook2(
    val name: String,
    val author: String,
)
// Data class уже под копотом имеет вывод toString. Но Если не устраивает вывод то его можно перепределить принудительно
