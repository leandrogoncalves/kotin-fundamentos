package collections.lambdas

fun main() {
    /*
    val person = Person
        .data()
        .find { it.name == "Davids" }
        ?.age
        ?: 0
    println(person)
     */

    val person = Person
        .data()
        .firstOrNull { it.name == "David" }
        ?.age
        ?: 0
    println(person)
}