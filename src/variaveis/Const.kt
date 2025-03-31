package variaveis

const val x = 10

fun main() {
    println(x)

    print("> ")
    val y = readln().toInt()
    println(if (y % 2 == 0) "Par" else "Impar")
    println("Par 2".takeIf { y % 2 == 0 } ?: "impar 2")
}