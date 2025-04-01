package collections

fun main() {
    val l1: List<String> = listOf("a", "b", "c", "d", "e")
    val l2: MutableList<String> = l1.toMutableList()
    l2.add("f")
    l2.forEach { println(it) }
    println()

    val s1: Set<String> = l1.toSet()
    val s2: MutableSet<String> = s1.toMutableSet()
    val s3: MutableSet<String> = s1.toMutableSet() // Copy Collection
    s2.add("f")
    println(s2)
    s3.add("g")
    println(s3)

}