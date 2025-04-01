package collections.lambdas

data class Person(val name: String, val age: Int) {
    companion object {
        fun data(): List<Person> {
            return listOf(
                Person("John", 25),
                Person("Alice", 30),
                Person("Bob", 28),
                Person("Charlie", 27),
                Person("David", 29),
                Person("Donald", 50),
                Person("Emily", 31),
                Person("Frank", 26),
                Person("Grace", 32),
                Person("Hannah", 24),
                Person("Isabella", 23),
                Person("Israel", 33),
                Person("Jack", 33),
                Person("Karen", 22),
                Person("Liam", 21),
                Person("Leandro", 34),
                Person("Mia", 34),
                Person("Noah", 20),
                Person("Olivia", 35),
                Person("Peter", 25),
                Person("Quinn", 24),
                Person("Rachel", 33),
            )
        }
    }
}