package ObjectOrientation

fun main() {
    val account = Account2(100.0)
    account.deposit(1000.0)
    account.withdraw(100.0)
    account.withdraw(500.0)
    println(account.balance)

}

class Account2(balance: Double) {

    init {
        require(balance >= 0) {
            throw IllegalArgumentException("Balance must be non-negative")
        }
    }
    var balance: Double = balance
        private set

    fun deposit(amount: Double) {
        require(amount > 0) {
            throw IllegalArgumentException("Amount must be positive")
        }
        balance += amount
    }

    fun withdraw(amount: Double) {
        require(amount > 0) {
            throw IllegalArgumentException("Amount must be positive")
        }
        require(amount <= balance) {
            throw IllegalArgumentException("Insufficient balance")
        }
        balance -= amount
    }
}