package org.example.Lesson19

fun main() {
    val goodDress = Goods("Платье", 13, Categories.CLOTHING)
    val goodScissors = Goods("Ножницы", 1, Categories.OFFICE_SUPPLIES)
    val goodPoster = Goods("Плакат", 2, Categories.MISCELLANEOUS)

    goodDress.info()
    goodScissors.info()
    goodPoster.info()
}

enum class Categories(val category: String) {
    CLOTHING("Одежда"),
    OFFICE_SUPPLIES("Концелярия"),
    MISCELLANEOUS("Разное");

    override fun toString(): String {
        return category
    }
}

class Goods(
    val name: String,
    val id: Int,
    val category: Categories
) {
    fun info() {
        println("Наименование = $name, id товара = $id, Категория =  $category")
    }
}