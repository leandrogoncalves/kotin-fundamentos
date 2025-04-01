package collections.lambdas

fun main() {
    val ages = Person
        .data()
        .map { it.age }
        .distinct()
        .sorted()

    println(ages)
}