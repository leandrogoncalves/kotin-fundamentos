package collections

fun main() {

    val codesMap = sortedMapOf(
        Comparator.reverseOrder(),
        55 to "Brasil",
        44 to "Espanha",
        35 to "Paraguai",
        351 to "Portugal",
        505 to "México",
        506 to "Nicaragua",
        591 to "Perú",
        51 to "Colombia",
        57 to "Venezuela",
        1 to "United States"
    )

    println(codesMap)
}