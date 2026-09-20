package TP5

data class User(val id: Int, val name: String, val email: String)

fun printUsersByDomain(users: List<User>, domain: String) {
    users.filter { it.email.endsWith(domain) }.forEach { println(it.name) }
}

fun main() {
    val users = listOf(
        User(1, "Aymen", "aymen@gmail.com"),
        User(2, "Sara", "sara@yahoo.com"),
        User(3, "Omar", "omar@gmail.com")
    )
    printUsersByDomain(users, "@gmail.com")
}