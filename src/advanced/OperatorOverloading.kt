package advanced

fun main() {
    val p1 = Point(1, 2)
    val p2 = Point(3, 4)
    var p6 = Point(4, 6)

//    val p3 = p1.plus(p2)
//    val p4 = p1.minus(p2)
//    val p5 = p1.times(2)

    val p3 = p1 + p2
    val p4 = p1 - p2
    val p5 = p1 * 2

    println(p3)
    println(p4)
    println(p5)

    p6++
    println(p6)
}

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x = x + other.x, y = y + other.y)
    }

    operator fun minus(other: Point): Point {
        return Point(x = x - other.x, y = y - other.y)
    }

    operator fun times(multiplier: Int): Point {
        return Point(x = x * multiplier, y = y * multiplier)
    }

    operator fun inc(): Point {
        return Point(x = x + 1, y = y + 1)
    }
}