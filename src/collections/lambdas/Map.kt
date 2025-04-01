package collections.lambdas

fun main() {
    val names = Person
        .data()
        .map { it.name }

    println(names)
}