package collections

fun main() {
    val cities = listOf("London", "Paris", "Lisboa", "Roma", "Berlim", "Madri", "Lisboa","Roma")
    println(cities)
    println(cities.size)

    val uniqueCities = cities.toSet()
    println(uniqueCities)
    println(uniqueCities.size)
}