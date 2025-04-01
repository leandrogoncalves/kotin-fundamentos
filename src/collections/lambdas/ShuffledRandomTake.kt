package collections.lambdas

/**
 * OBJETIVO
 *
 * Obter 3 nomes aleatórios de pessoas
 */
fun main() {
    val names = Person
        .data()
        .map { it.name }
        .shuffled()
        .take(3)

    println(names)

    val names2 = Person
        .data()
        .map { it.name }
        .randomOrNull()

    println(names2)
}