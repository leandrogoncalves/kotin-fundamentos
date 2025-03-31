package ObjectOrientation

fun main() {
    var p = Person()
    p.walk()
    p.walk()
    p.walk()
    p.walk()
    p.walk()
    p.drinkWater()
    p.walk()
    p.walk()
    p.walk()
    p.walk()
    p.walk()
    p.drinkWater()
    p.walk()
    p.walk()
    println("A pessoa andou ${p.end()}")

    val p2 = Person(1000)
    p2.walk()
    p2.drinkWater()
    p2.walk()
    p2.walk()
    p2.drinkWater()
    p2.walk()
    println("A pessoa andou ${p2.end()}")
}

private class Person(
    private val initialDistanceWater: Int = 5000
) {
    private var distance = 0
    private var distanceWater = initialDistanceWater

    fun walk() {
        if (distanceWater > 0) {
            distance += 1000
            distanceWater -= 1000
        }
    }

    fun drinkWater() {
        distanceWater += initialDistanceWater
    }

    fun end(): Int {
        return distance
    }
}