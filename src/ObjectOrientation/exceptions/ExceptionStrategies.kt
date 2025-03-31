package ObjectOrientation.exceptions

fun main() {
    a()
}

fun a() {
    try {
        b()
    } catch (e: B) {
        throw A(e)
    }
}

fun b() {
    throw B()
}

class A(cause: Throwable) : RuntimeException(cause)
class B : RuntimeException()