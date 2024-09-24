package org.example.Lesson15

fun main() {
    val guitar = MusicalInstruments("Гитара", 1)
    val string = Components("Струна", 2)
    guitar.search(string)
}

interface Search {
    fun search(components: Components)
}

abstract class Product(
    val name: String,
    val quantityInStock: Int,
)

class MusicalInstruments(name: String, quantityInStock: Int) : Search, Product(name = name, quantityInStock = quantityInStock) {
    override fun search(components: Components) {
        println(
            "Выполняется поиск для $name...\n" + "Было найдено\n" +
                    "${components.name} в кольчетве ${components.quantityInStock} шт."
        )
    }
}

class Components(name: String, quantityInStock: Int) : Product(name = name, quantityInStock = quantityInStock)