package collections

import java.util.Objects

fun main() {
    val dogs = setOf(
        Dog("D1"),
        Dog("D2"),
        Dog("D2"),
        Dog("D3"),
        Dog("D4"),
    )

    println(dogs)
}

data class Dog(val name: String) {
    override fun toString(): String = "Dog(name=$name, hashcode=${hashCode()})"

//    override fun hashCode(): Int {
//        return Objects.hash(name)
//    }
//
//    override fun equals(other: Any?): Boolean {
//        return if (other is Dog)
//            this.name === other.name
//        else
//            false
//    }
}