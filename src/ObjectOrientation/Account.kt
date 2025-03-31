package ObjectOrientation

class Account private constructor(
    val accountNumber: String,
    val accountOwner: String
) {

    private var balance: Double = 0.0

    private constructor() : this(accountOwner= "", accountNumber = "") {
        print("Constructor")
    }

    constructor(accountNumber: String, accountOwner: String, balance: Double)
            : this(accountNumber = accountNumber, accountOwner = accountOwner)
    {
        this.balance = balance
    }

    fun deposit(amount: Double) {
        balance += amount
    }

    fun deposit(amount: Int) {
        balance += amount
    }

    fun balance() {
        println("Account number: $accountNumber; Owner: $accountOwner; balance: $balance")
    }
}