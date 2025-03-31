package nullable

fun main() {

    println(
        readln()
            .toIntOrNull() ?: 2
            .times(2)
            .times(2)
            .minus(10)

    )
    println(10.times(2))
}