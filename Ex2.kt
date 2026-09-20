package TP5

sealed class OperationResult
data class Success(val data: String) : OperationResult()
data class Failure(val errorMessage: String) : OperationResult()
object Loading : OperationResult()

fun handleResult(result: OperationResult) {
    when (result) {
        is Success -> println("Success: ${result.data}")
        is Failure -> println("Error: ${result.errorMessage}")
        Loading -> println("Loading...")
    }
}

fun main() {
    handleResult(Success("Data loaded"))
    handleResult(Failure("Network error"))
    handleResult(Loading)
}