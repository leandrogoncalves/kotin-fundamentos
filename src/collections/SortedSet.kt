package collections

fun main() {
    val s = sortedSetOf(Comparator.reverseOrder(), 1,2,8,6,3,5,2,7,1)
    println(s)

    val sortedSet = s.toSortedSet()
    println(sortedSet)

    val dogs = sortedSetOf(
        Comparator.comparing { dog: Dog -> dog.name }.reversed(),
        Dog("D1"),
        Dog("D2"),
        Dog("D2"),
        Dog("D3"),
        Dog("D4"),
    )

    println(dogs)
}