package variaveis

fun main() {
    val num = 10
    val numLong: Long = num.toLong()

    println("numLong: $numLong")
    println("num: $num")

    val double: Double = numLong.toDouble()
    println("double: $double")

    val numInt = double.toInt()
    println("numInt: $numInt")

    val num2 = 1000
    val bite = num2.toByte()
    println("bite: $bite")
    println("num2: $num2")

    val num3 = "101"
    val num4 = num3.toInt()
    println("num4: $num4")
}