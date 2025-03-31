package operadores

fun main() {
    val a = true
    val b = false

    //Conjunção (AND)
    //println(a && b)

    //Disjunção (OR)
    //println(a || b)

    //Negação (NOT)
    //(!a)
    //println(!b)

    println("T and T: ${true && true}")
    println("T and F: ${true && false}")
    println("F and T: ${false && true}")
    println("F and F: ${false && false}")

    println("T or T: ${true || true}")
    println("T or F: ${true || false}")
    println("F or T: ${false || true}")
    println("F or F: ${false || false}")

    println("Not T: ${!true}")
    println("Not F: ${!false}")


}