package collections

fun main() {
    val m1: Map<Int, String> = mapOf(
        Pair(1, "A"),
        Pair(2, "B")
    )
    println(m1)

    val m2: Map<String, Int> = mutableMapOf(
        "C" to 3,
        "D" to 4
    )
    println(m2)

    val v1 = m1.get(1)
    val v2 = m2["C"]
    println(v1)
    println(v2)

    val m3 = m1.toMutableMap()
    m3.put(3, "C")
    m3[4] = "D"
    println(m3)
    println(m1)
}