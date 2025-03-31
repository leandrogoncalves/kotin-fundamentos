package ObjectOrientation.inheritance

fun main() {
    val dog = Dog("Branco")
    val cat = Cat("Preto")

//    println(animal is Animal)
//    println(dog is Dog)
//    println(cat is Cat)
//    println(cat is Animal)
//    println(cat is Animal)

//    cat.meow()
//    cat.eat()
//    println(cat.color)

//    dog.bark()
//    dog.eat()
//    println(dog.color)

    var b: Animal = Dog()
//    var c: Dog = b as Dog
//    b.run()
//    c.run()
    //Smart cast
    if (b is Dog) {
        b.eat()
        b.run()
    }

}

abstract class Animal(val color: String = "") {
    open fun eat() {
        println("I am eating.")
    }

    protected fun sleep() {
        println("Sleeping")
    }
}

class Dog(color: String = "") : Animal(color) {
    fun bark() {
        println("Woof!")
    }

    fun run() {
        println("Running")
    }

    override fun eat() {
        println("Dog is eating.")
    }
}

class Cat(color: String = "") : Animal(color) {
    fun meow() {
        println("Meow!")
        sleep()
    }
}

