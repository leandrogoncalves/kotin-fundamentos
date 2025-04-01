package collections.lambdas

fun main() {
    val reduce = Person
        .data()
        .map { it.age }
        .reduce {act, age -> act + age}
    println(reduce)
}