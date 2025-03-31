package ObjectOrientation.exceptions

fun main() {
    //val x = throw InvalidValueException()
    val i: Int? = null
    val d = i?.toDouble() ?: throw IllegalArgumentException()

    println(d)
}