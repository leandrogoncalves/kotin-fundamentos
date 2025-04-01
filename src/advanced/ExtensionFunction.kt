package advanced

fun main() {
    val l = listOf(1,2,3,4,5,6,7,8,9,10,11,12).sumEvenNumbers()
    //println(sumEvenNumbers(l))
    println(l)

    println()

    val s = "Hello, World!"
    println(s.hide())
}

//fun sumEvenNumbers(list: List<Int>): Int {
//    return list.filter { it % 2 == 0 }.sum()
//}

//Extension Functions
fun List<Int>.sumEvenNumbers(): Int {
    return this.filter { it % 2 == 0 }.sum()
}

//Caso a função extendida esteja em outro pacote é preciso fazer o import
fun String.hide(): String {
    return "".padEnd(length, '*')
}