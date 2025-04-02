package collections

fun main() {
    var mapNameAge = mutableMapOf("Leandro" to 34, "Maria" to 23)
    println(mapNameAge)

    mapNameAge["Leandro"] = 35
    println(mapNameAge)

    mapNameAge.remove("Maria")
    println(mapNameAge)

    mapNameAge.putIfAbsent("Maria", 22)
    println(mapNameAge)
}