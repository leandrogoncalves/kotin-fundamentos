package LambdaExpressions

fun main() {
    val r1 = sum(10, 5)
    println(r1)

    val f1 = fun (a: Int, b: Int): Int = a + b
    println(f1(10, 2))

    val f2: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(f2(10, 2))
}

fun sum(a: Int, b: Int): Int = a + b