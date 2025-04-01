package collections.lambdas

fun main() {
    val existsAge = Person
        .data()
        //.any { it.age == 26 }
        //.all {it.age == 20}
        .none { it.age == 99 }

    println(existsAge)
}