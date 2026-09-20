package TP5

class Box(val size: Int) {
    inner class Item(val name: String) {
        fun printDetails() {
            println("Box size: $size, Item: $name")
        }
    }
}

fun main() {
    val item = Box(10).Item("Book")
    item.printDetails()
}