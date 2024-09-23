package org.example.Lesson22

fun main() {
    val book = RegularBook("Властелин колец", "Толкин, Джон Рональд Руэл")
    val book1 = RegularBook("Властелин колец", "Толкин, Джон Рональд Руэл")
    val book2 = DataBook("Властелин колец", "Толкин, Джон Рональд Руэл")
    val book3 = DataBook("Властелин колец", "Толкин, Джон Рональд Руэл")
    println(book == book1)
    println(book2 == book3)
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

// Первый println сравнивает ссылки на объект.  Это обычный класс. По этому мы получаем false. Так как это две разные ссылки.
// Во втором println сравнивается уже проинициализированные значения. Это data класс. Так как у объектов одинаковые
// значения, мы получаем true.