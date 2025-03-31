package functions

sealed class NumberOrString {
    data class Number(val value: Int) : NumberOrString()
    data class Text(val value: String) : NumberOrString()
}

fun process(value: NumberOrString) {
    when (value) {
        is NumberOrString.Number -> println("Número: ${value.value}")
        is NumberOrString.Text -> println("Texto: ${value.value}")
    }
}


fun main() {
    //println(multiply(7,8))
    //println(any("a"))
    //println(any(10))
    //printValue("a")
    //printValue(10)
//    printGeneric('b')
//    printGeneric(20)
    process(NumberOrString.Number(123))
    process(NumberOrString.Text("Olá!"))
}

private fun multiply(a: Int, b: Int) = a * b

fun any(a: Any) {
    println(a)
}

fun printValue(v: Int) {
    println("Int $v")
}

fun printValue(v: String) {
    println("String $v")
}

fun <T> printGeneric(v: T) {
    println("Generic $v")
}