package collections.lambdas

fun main() {
    val maxByName = Person
        .data()
        .map { it.name }
        .maxBy { it.length }
    println(maxByName)

    val minOfAge = Person
        .data()
        .minOf { it.age }
    println(minOfAge)
}