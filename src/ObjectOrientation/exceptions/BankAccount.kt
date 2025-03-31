package ObjectOrientation.exceptions

fun main() {
    val account = BankAccount()

    try {
        account.withdraw(100.0)
        account.withdraw(200.0)
    } catch (e: InvalidValueException) {
        println("Ops, invalid operation: ${e.message}")
    } catch (e: InsufficientFundsException) {
        println("Error, Current balance is ${e.currentBalance}")
    } finally {
        println("Final balance: ${account.balance}")
    }

}

class BankAccount {
    var balance: Double = 0.0
        private set

    fun deposit(amount: Double) {
        if (amount < 0) {
            throw InvalidValueException(amount)
        }
        balance += amount
    }

    fun withdraw(amount: Double) {
        if (amount < 0) {
            throw InvalidValueException(amount)
        }
        if (balance < amount) {
            throw InsufficientFundsException(balance)
        }
        balance -= amount
    }
}

class InvalidValueException(val value: Double) : RuntimeException("Value $value is not valid")

class InsufficientFundsException(val currentBalance: Double) : RuntimeException()