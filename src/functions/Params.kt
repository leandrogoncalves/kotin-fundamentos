package functions

fun main() {
    //sayHello("Pedro", 30)

    //val result = calculate(5, 7)
    //println("Result: $result")

    println(pow(exp = 2, base = 10.0))
}

fun sayHello(name: String, temperature: Int) {
    println("Hello $name! Temperature: ${temperature}")
}

private fun calculate(a: Int, b: Int): Int {
    return a + b
}

private fun pow(base: Double, exp: Int): Double {
    var r = base
    for (i in 1..exp) {
        r *= base
    }
    return r
}