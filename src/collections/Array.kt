package collections

import java.util.*

fun main() {
//    val array = Array(5) {""}
//    println(array)
//    println(Arrays.toString(array))

    val array = arrayOf("a", "b", "c")
    array[0] = "Hello"
    array[1] = "World"
    //array[5] = "Cool" // ArrayIndexOutOfBoundsException
    println(array.contentToString())
}