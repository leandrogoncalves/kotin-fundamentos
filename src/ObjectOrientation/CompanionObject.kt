package ObjectOrientation

fun main() {
    println(Math.sum(20, 10))
    println(Math().subtract(10, 4))
    println(Math.MAX)
}

class Math {
    fun subtract(a: Int, b: Int) = a - b

    companion object {
        val MAX = 123
        fun sum(a: Int, b: Int) = a + b
    }
}