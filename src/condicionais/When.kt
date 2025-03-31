package condicionais

fun main() {
    var month = 1

    var name = when(month) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> {
            "Dezembro"
        }
        else -> "Mês inválido"
    }

    println(name)
    month++

    name = when {
        month == 1 -> "Janeiro"
        month == 2 -> "Fevereiro"
        month == 3 -> "Março"
        month == 4 -> "Abril"
        month == 5 -> "Maio"
        month == 6 -> "Junho"
        month == 7 -> "Julho"
        month == 8 -> "Agosto"
        month == 9 -> "Setembro"
        month == 10 -> "Outubro"
        month == 11 -> "Novembro"
        month == 12 -> "Dezembro"
        else -> "Mês inválido"
    }

    println(name)

    val x = 10

    when (x) {
        in 1..10 -> println("x está entre 1 e 10")
        in 11..20 -> println("x está entre 11 e 20")
        else -> println("x não está entre 1 e 20")
    }

    val s = 'A'

    val v = when (s) {
        'A', 'a' -> 1
        'E', 'e' -> 2
        else -> 3
    }

    println(v)
}