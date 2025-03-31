package nullable

fun main() {
    val s: String? = "null"
    val i = s!!.reversed()

    println(i)
}