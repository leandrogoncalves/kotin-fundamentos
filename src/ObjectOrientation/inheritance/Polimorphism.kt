package ObjectOrientation.inheritance

fun main() {
    val c = Coffee()
    c.prepare()
}

open class Drink {
    open fun prepare() {
        println("Preparing drink...")
    }
}

class Coffee : Drink() {
    override fun prepare() {
        super.prepare()
        println("Preparing coffee...")
    }
}