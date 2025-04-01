package collections

fun main() {
    val l1 = listOf(1,2,3)
    val l2: List<Int> = emptyList<Int>()
   // l1.forEach {println(it)}
    val l3 = mutableListOf(1,2,3)
    val l4 = listOfNotNull(1,2,3,null,5,6)

    l3.add(1, 20)
    l3.add(10)

    l3.forEach {println(it)}
    println()
    l4.forEach {println(it)}


}