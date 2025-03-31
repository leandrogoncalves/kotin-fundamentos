package estruturasDeRepeticao

fun main() {
    /**
    var x = 0

    while (x < 10) {
        println("while $x ")
        x++
    }

    do {
        println("do while $x ")
        x++
    } while (x < 10)
    */

    print("> ")
    val n = readln().toInt()
    var i = 1
    while (i <= 10) {
        println("$n x $i = ${n * i++}")
    }
}