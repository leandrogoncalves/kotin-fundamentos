package nullable

fun main() {
    val password: String? = null
    val defaultPassword = "12345"
    val mask = "".padEnd((password ?: defaultPassword).length, '*')

    println("Password: $password")
    println("Mask: $mask")
}