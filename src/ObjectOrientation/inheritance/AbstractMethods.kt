package ObjectOrientation.inheritance

fun main() {
    val p = Programmer()
    p.work()

    val t = Teacher()
    t.work()

    val p2 = KotlinProgrammer()
    p2.work()

    var c: Programmer = KotlinProgrammer()
    c.work()

    c = Programmer()
    c.work()
}

abstract class Employee {
    abstract fun work()
}

open class Programmer : Employee() {
    override fun work() {
        println("Programmer is working...")
    }
}

class KotlinProgrammer : Programmer() {
    override fun work() {
        println("Kotlin Programmer is working...")
    }
}

class Teacher : Employee() {
    override fun work() {
        println("Teacher is working...")
    }
}