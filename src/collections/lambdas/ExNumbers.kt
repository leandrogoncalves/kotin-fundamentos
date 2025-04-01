package collections.lambdas

fun main() {
    listOf(1, 7, 6, 14, 5)
        //.associate { it to it + 1 }
        .associateWith { it + 1 }
        .toSortedMap()
        .forEach { (k, v) -> println("$k -> $v")}
}