package collections

fun main() {
    var circles = arrayOf(
        Circle(2.0),
        Circle(3.0),
        Circle(4.0)
    )

//    repeat(circles.size) {
//        val circle = circles[it]
//        val surface = circle.surface()
//        println("Circle with radius ${circles[it].radius} has a surface area of $surface")
//    }

//    for (i in 0 until circles.size) {
//        val circle = circles[i]
//        val surface = circle.surface()
//        println("Circle with radius ${circles[i].radius} has a surface area of $surface")
//    }

//    for (i in circles.indices) {
//        val circle = circles[i]
//        val surface = circle.surface()
//        println("Circle with radius ${circles[i].radius} has a surface area of $surface")
//    }

    circles.forEach { println(it.surface())}
}

class Circle(val radius: Double) {
    fun surface() = Math.PI * radius * radius
}