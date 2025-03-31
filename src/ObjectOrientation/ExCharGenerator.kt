package ObjectOrientation

fun main() {
    val g = CharGenerator(min = 'A', max = 'B')
    println(g.next())
    println(g.next())
    println(g.next())
}

class CharGenerator(
    val min: Char,
    val max: Char,
) {
    fun next() = (min..max).random()
}