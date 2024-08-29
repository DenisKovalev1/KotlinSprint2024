package org.example.Lesson15

fun main() {
    val guitar = Tools("Гитара", 1)
    val string = Components("Струна", 2)
    guitar.search(string)


}

interface Search {
    fun search(components: Components)
}

class Tools(val name: String, val quantityInStock: Int) : Search {
    override fun search(components: Components) {
        println(
            "Выполняется поиск для $name...\n" + "Было найдено\n" +
                    "${components.name} в кольчетве ${components.quantityInStock} шт."
        )
    }


}

class Components(val name: String, val quantityInStock: Int)