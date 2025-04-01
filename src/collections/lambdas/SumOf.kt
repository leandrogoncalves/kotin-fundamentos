package collections.lambdas

fun main() {
    val sum = Person
        .data()
        .filter { it.name.uppercase().startsWith("D")}
        .sumOf { it.age }
    println(sum)
}