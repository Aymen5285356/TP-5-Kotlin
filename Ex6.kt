package TP5

class Library(val libraryName: String) {
    inner class Book(val title: String, val author: String) {
        fun printDetails() {
            println("Library: $libraryName, Book: $title by $author")
        }
    }
}

fun main() {
    val book = Library("City Library").Book("Kotlin Basics", "John Doe")
    book.printDetails()
}