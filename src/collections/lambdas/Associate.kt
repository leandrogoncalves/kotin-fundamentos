package collections.lambdas

fun main() {
    val map = Person
        .data()
        //.associate { p -> Pair(p.name, p.age) }
        //.associate { Pair(it.name, it.age) }
        .associate { it.name to it.age }
        .forEach { (k, v) -> println("$k: $v") }

    //println(map)
}