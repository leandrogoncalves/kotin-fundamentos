package variaveis

import java.util.Scanner

fun main() {
    /**
    print("Digite seu nome:")
    val name = readlnOrNull()
    print("Seu nome invertido é , ${name?.reversed()}!")
    */

    /**
    val a = readln().toDouble()
    val b = readln().toDouble()

    val result = a + b
    println(result)
    */
    var scaner = Scanner(System.`in`)
    print("> ")
    val n1 = scaner.nextInt()

    print("> ")
    val n2 = scaner.nextInt()

    println("$n1 + $n2 = ${n1 + n2}")
}