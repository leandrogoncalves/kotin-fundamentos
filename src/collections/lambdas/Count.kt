package collections.lambdas

fun main() {
    /*
    val count = Person
        .data()
        .filter { it.name.uppercase().startsWith("D") }
        .count()

     */

    val count = Person
        .data()
        .count { it.name.uppercase().startsWith("D") }
    println(count)
}