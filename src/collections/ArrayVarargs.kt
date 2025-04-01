package collections

fun main() {
    println(sum(5,2,8,7,9,50,60))

    val a = intArrayOf(5,2,8,7,9,50,60)
    println(sum(*a))
}

fun sum(vararg values: Int): Int {
    var sum = 0
    values.forEach { sum += it }
    return sum
}