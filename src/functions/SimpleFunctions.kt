package functions

fun main() {
    sayHelloPrivate(name = "Pedro")

    var x = doSomething()
    println(x)

    TODO("Testing")
}

private fun sayHelloPrivate(name: String, message: String = "") {
    println("Hello, $name! $message")
}

private fun doSomething(): Unit {
    //do something
}

//private fun doNothing(): Nothing {
//    //do nothing
//}