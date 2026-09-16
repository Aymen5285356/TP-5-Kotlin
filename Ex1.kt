package TP5

sealed class Payment() {

}

class CashPayment (val amount: Double) :Payment()
class CardPayment (val amount: Double,val cardNumber: String):Payment()
class DigitalPayment (val amount: Double,val provider: String):Payment()

fun printPaymentDetails(payment: Payment){
    when(payment){
        is  CardPayment ->
            println("Card Payment ${payment.amount}")
        is CashPayment ->
            println("Cash Payment ${payment.amount}")
        is DigitalPayment ->
            println("Digtal Payment ${payment.amount}")
    }
}
fun main(){
    var cash = CashPayment(12.0)
    var digitizl = DigitalPayment(12.0,"00000000000")
    var card = CardPayment(12.0,"0")
    printPaymentDetails(cash)
    printPaymentDetails(digitizl)
    printPaymentDetails(card)
}