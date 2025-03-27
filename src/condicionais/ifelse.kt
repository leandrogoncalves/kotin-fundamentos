package condicionais

fun main() {
    val age = readln().toInt()

    val message = if (age > 18)
        "vc pode tirar carteira de motorista"
    else if(age  >= 16)
        "vc pode votar"
    else
        "Menor de idade"


    println(message)
}