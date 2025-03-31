package ObjectOrientation

fun main() {
    val car1 = Factory.newCar()
    val car2 = Factory.newCar()
    val car3 = Factory.newCar()

    println(Factory.instanceCount)
}

object Factory {
    var instanceCount = 0
    fun newCar(): Car {
        instanceCount++
        return Car()
    }
}

class Car