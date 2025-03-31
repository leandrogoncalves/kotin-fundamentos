package variaveis

fun main() {
    //Tipos de dados númeriocos:
    /**
     * Byte: 8 bits
     * Short: 16 bits
     * Int: 32 bits
     * Long: 64 bits
     * Float: 128 bits
     * Double: 256 bits
     */
    val byte: Byte = 8
    val short: Short = 360
    val int: Int = 1000
    val long: Long = 1000000000000000000L
    val float: Float = 10.0f
    val double: Double = 10.0

//    println("byte: $byte")
//    println("short: $short")
//    println("int: $int")
//    println("long: $long")
//    println("float: $float")
//    println("double: $double")

    // Tipo booleano
    /**
     * boolean: true ou false
     */
    val boolean: Boolean = false
//    println("boolean: $boolean")

    // Tipos textuais
    /**
     * char
     */
    var char: Char = 'c'
//    println("char: $char")
//    println(char.code)

    val i = 65
//    println(i.inc().toChar())

    val c2 = '1'
//    println(c2.inc().inc())
//    println(c2.dec())
//    println(c2.isDigit())
//    println(c2.isUpperCase())
//    println(c2.digitToInt())

    /**
     * String
     */

    val string: String = "String"
//    println("string: $string")

    val s1 = "abc"
    val s2 = "def"
    val s3 = s1 + s2
//    println("s3: $s3")
//    println(s3.length)

    val s1s2 = "Soma: '$s1$s2' o tamanho é: ${(s1 + s2).length}')"
//    println(s1s2)

    /**
     * O rato roeu
     * a roupa do
     * rei de "Roma"
     */

    val s4 = """
        O rato roeu
         a roupa do
          rei de "Roma"
    """.trimIndent()

    println("s4: $s4")

    val s5 = "O rato roeu\na \$roupa do\nrei de \"Roma\"."
    println("s5: $s5")

    val s6 = """
        |    O rato roeu
        |  a roupa do
        |rei de "Roma"
    """.trimMargin()
    println("s6: $s6")

}