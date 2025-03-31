package ObjectOrientation.exceptions

fun main() {
    println(div(10, 2))
    println(div(10, 0))
}

fun div(n1: Int, n2: Int): Int {
    return try {
        n1 / n2
    } catch (e: ArithmeticException) {
        0
    }
}