package TP5

sealed class OperationResult {
}
class Success(val MesseageEnvoyer: String) : OperationResult()
class Failure(val errorMessage: String) : OperationResult()
class Loading(val analyseData: String) : OperationResult()

fun printOperationResult(result: OperationResult){
    when (result) {
        is Success ->
            println("Success : ${result.MesseageEnvoyer}")
        is Failure ->
            println("Failure : ${result.errorMessage}")
        is Loading ->
            println("Loading : ${result.analyseData}")
    }
}
fun main(){
    val result1: OperationResult = Success("avec succes")
    val result2: OperationResult = Failure ("Error de reseau")
    val result3: OperationResult = Loading("analyse en cours")

printOperationResult(result1)
printOperationResult(result2)
printOperationResult(result3)
}