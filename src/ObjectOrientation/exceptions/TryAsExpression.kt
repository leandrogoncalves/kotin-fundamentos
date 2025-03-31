package ObjectOrientation.exceptions

fun main() {
    print("> ")
    val v = readln()
    val i = try {
        v.toInt()
    } catch (e: NumberFormatException) {
        0
    }
    println("Converted value: $i")
}