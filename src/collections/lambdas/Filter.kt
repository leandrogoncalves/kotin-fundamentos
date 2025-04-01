package collections.lambdas

fun main() {
    /*
    val people = Person.data()
    val people2 = people.filter { it.age > 18 }
    println(people)
    println(people2)
    */

    Person
        .data()
        .filter { it.age > 18 }
        .forEachIndexed { i, p -> println("${i+1}. $p") }
}