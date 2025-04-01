package collections.lambdas

fun main() {
    /**
    Person
        .data()
        .groupBy { it.name[0] }
        .forEach { (k, p) -> println("$k: $p") }
    */
    Person
        .data()
        .groupBy({ it.name[0] }, { it.name })
        .forEach { (k, p) -> println("$k: $p") }
}