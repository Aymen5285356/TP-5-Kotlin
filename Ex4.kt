package TP5

data class Product(val name: String, val price: Double, val quantity: Int) {
    fun totalPrice(): Double = price * quantity

    fun printDetails() {
        println("$name | price: $price | quantity: $quantity | total: ${totalPrice()}")
    }
}

fun main() {
    val products = listOf(Product("Laptop", 5000.0, 2), Product("Mouse", 100.0, 3))
    products.forEach { it.printDetails() }
    println("Total: ${products.sumOf { it.totalPrice() }}")
}