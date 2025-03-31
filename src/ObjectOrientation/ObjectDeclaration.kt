package ObjectOrientation

fun main() {
    println(Math2.sum(20,5))
    println(Math2.subtract(18, 4))
    println(Math2.pi)
}

object Math2 {
    val pi = 3.1416
    fun subtract(a: Int, b: Int): Int = a - b
    fun sum(a: Int, b: Int): Int = a + b
}