package ObjectOrientation.exceptions

fun main() {
    try {
        val obj: Any? = null
        obj!!.toString()

        "abc".toInt()

    }catch (e: Exception) {
        println("An error occurred: ${e.message}")
    }

}