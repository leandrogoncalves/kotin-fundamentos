package ObjectOrientation.exceptions

fun main() {
    val rect = Rect(10.0, 2.0)
    println(rect)
}

data class Rect(val width:Double, val height:Double) {
    init {
        require(width > 0 && height > 0) { "Width and height must be positive." }
    }
}