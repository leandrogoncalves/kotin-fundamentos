package ObjectOrientation.exceptions

fun main() {
    val bankAccount = BankAccount()

    try {
        bankAccount.deposit(500.0)
        bankAccount.withdraw(100.0)
        println("Withdrawal successful!")
    } catch (_: Exception) {}

    println("Current balance: ${bankAccount.balance}")
}