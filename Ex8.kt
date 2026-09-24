package TP5

enum class DayOfWeek { LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE }

fun printDayMessage(day: DayOfWeek) {
    val message = when (day) {
        DayOfWeek.LUNDI -> "Lundi : début de la semaine"
        DayOfWeek.MARDI -> "Mardi : on continue"
        DayOfWeek.MERCREDI -> "Mercredi : milieu de la semaine"
        DayOfWeek.JEUDI -> "Jeudi : bientôt la fin"
        DayOfWeek.VENDREDI -> "Vendredi : presque le week-end"
        DayOfWeek.SAMEDI -> "Samedi : week-end"
        DayOfWeek.DIMANCHE -> "Dimanche : jour de repos"
    }
    println(message)
}

fun main() {
    DayOfWeek.values().forEach { printDayMessage(it) }
}