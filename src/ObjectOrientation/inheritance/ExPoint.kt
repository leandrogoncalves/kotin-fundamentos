package ObjectOrientation.inheritance

fun main() {
    val point2D = Point2D(1.0, 2.0)
    val point3D = Point3D(3.0, 4.0, 5.0)

    println(point2D)
    println(point3D)
}

open class Point2D(
    val x: Double,
    val y: Double

)

open class Point3D(
    x: Double,
    y: Double,
    val z: Double
) : Point2D(x, y)