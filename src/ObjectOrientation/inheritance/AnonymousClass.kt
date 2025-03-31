package ObjectOrientation.inheritance

fun main() {

    val vehicle = object : Vehicle {
        override fun drive() {
            println("Driving the vehicle...")
        }
    }
    vehicle.drive()
}

interface Vehicle {
    fun drive()
}