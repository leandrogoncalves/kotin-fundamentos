package LambdaExpressions

fun main() {
    var (f, s) = "aBcDeFgHijklmnop".partition { it.isUpperCase() }

    println("First: $f")
    println("Second: $s")
}

