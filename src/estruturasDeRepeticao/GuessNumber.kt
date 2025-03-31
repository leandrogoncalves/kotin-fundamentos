package estruturasDeRepeticao

import kotlin.random.Random

fun main() {
    val secret = Random.nextInt(0, 101)

    while (true) {
        print("> ")
        val guess = readln().toInt()

        when {
            guess > secret -> println("O número sorteado é menor que $guess")
            guess < secret -> println("O número sorteado é maior que $guess")
            else -> {
                println("Parabéns! Você acertou!")
                break
            }
        }
    }

    println("O número secreto era $secret")
}