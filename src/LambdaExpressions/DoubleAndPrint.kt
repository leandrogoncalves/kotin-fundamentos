package LambdaExpressions

fun main() {
    val f: (Int) -> Int = {n: Int ->
        val d = n * 2
        println("New Value: $d")
        d
    }
    f(5)
}