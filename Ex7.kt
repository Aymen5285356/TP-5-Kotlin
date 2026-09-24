package TP5

enum class OrderStatus { PENDING, SHIPPED, DELIVERED, CANCELLED }

class Order(var status: OrderStatus)

fun updateStatus(order: Order) {
    order.status = when (order.status) {
        OrderStatus.PENDING -> OrderStatus.SHIPPED
        OrderStatus.SHIPPED -> OrderStatus.DELIVERED
        OrderStatus.DELIVERED -> OrderStatus.DELIVERED
        OrderStatus.CANCELLED -> OrderStatus.CANCELLED
    }
}

fun main() {
    val order = Order(OrderStatus.PENDING)
    println(order.status)
    updateStatus(order)
    println(order.status)
    updateStatus(order)
    println(order.status)
}