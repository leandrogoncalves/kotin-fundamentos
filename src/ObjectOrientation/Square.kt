package ObjectOrientation

fun main() {
    val s1 = Square(10)
    val s2 = Square(-10)
    val s3 = Square(10)
}

class Square(val size: Int) {

    init {
        println("init 1")
        require(size < 0)
    }
}