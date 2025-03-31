package ObjectOrientation.inheritance

fun main() {
    val d1 = TV()
    d1.on()
    println(d1.isOn)
    val d2 = Smartphone()
    println(d2.isOn)

}

abstract class Device {
    var isOn = false
        private set

    fun on() {
        isOn = true
    }

    fun off() {
        isOn = false
    }
}

class TV : Device()

class Smartphone : Device()