package TP5

sealed class Payment
data class CashPayment(val amount: Double) : Payment()
data class CardPayment(val amount: Double, val cardNumber: String) : Payment()
data class DigitalPayment(val amount: Double, val platform: String) : Payment()

fun printPayment(payment: Payment) {
    when (payment) {
        is CashPayment -> println("Cash payment: ${payment.amount} MAD")
        is CardPayment -> println("Card payment: ${payment.amount} MAD, card ${payment.cardNumber}")
        is DigitalPayment -> println("Digital payment: ${payment.amount} MAD via ${payment.platform}")
    }
}

fun main() {
    printPayment(CashPayment(100.0))
    printPayment(CardPayment(250.0, "1234-5678-9012-3456"))
    printPayment(DigitalPayment(80.0, "PayPal"))
}