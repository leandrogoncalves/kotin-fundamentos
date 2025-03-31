package functions

fun main() {
    println(spacing("Oi, Tudo bem?", true))
}

fun spacing(str: String, isUpercase: Boolean = false): String {
    val sb = StringBuilder()

    for (char in str) {
        sb.append("$char ")
    }

    val r = sb.toString()

    return if (isUpercase) r.uppercase() else r
}