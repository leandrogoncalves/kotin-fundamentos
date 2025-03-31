package LambdaExpressions

fun main() {
    val code = "a7Bx9Zt3Kp2Qm8Ry5Lc1Nw"
    val s2 = code.filter { it.isDigit()}
    println(s2)

    val s3 = code.filter { it.isLetter()}
    println(s3)

    val s4 = code.filterIndexed { i, c ->
        val digit = c.isDigit()
        if (digit) println("Found digit $c in position $i")
        return@filterIndexed digit
    }
}