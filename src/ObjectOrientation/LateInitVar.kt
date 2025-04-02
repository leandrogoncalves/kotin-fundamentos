package ObjectOrientation

fun main() {
    val v = Vars()
    v.init()
    println(v.test) // Will print "Hello"
}

class Vars {
    lateinit var test : String
    fun init() {
        test = "Hello"
    }
}