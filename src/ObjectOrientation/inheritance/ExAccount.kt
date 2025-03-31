package ObjectOrientation.inheritance

fun main() {
    val account = Account(PersonName("Carlos", "tosin"))
    account.deposit(1000.0)
    account.print()

    val account2 = Account(object: Nemeable {
        override val firstName: String = "Pedro"
        override val lastName: String = "Maia"
    })
    account2.deposit(500.0)
    account2.print()
}

class Account(private val owner: Nemeable) : Printable {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        balance += amount
    }

    override fun print() {
        println("Balance for: ${owner.fullName}: $balance")
    }
}

interface Nemeable {
    val firstName: String
    val lastName: String
    val fullName: String
        get() = "$firstName $lastName"
}

interface Printable {
    fun print()
}

class PersonName(override val firstName: String, override val lastName: String) : Nemeable