package collections.lambdas

fun main() {
    val map = Person
        .data()
        .associateBy {it.name }
        .forEach { (k, p) -> println("$k: $p") }

    //println(map)
}