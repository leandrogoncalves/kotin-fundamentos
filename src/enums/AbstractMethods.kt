package enums

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

fun main() {
    val operation = Operation.PLUS
    println(operation.apply(5, 3))

    val operation2 = Operation.valueOf("DIVIDE")
    println(operation2.apply(10, 2))

    val operations = Operation.values()
    for (op in operations) {
        println("${op.name} = ${op.apply(5, 3)}")
    }

    val operation3 = Operation.values().firstOrNull { it.name == "INVALID" }
    println(operation3?.name)
}

enum class Operation : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(n1: Int, n2: Int): Int = n1 + n2
    },
    MINUS {
        override fun apply(n1: Int, n2: Int): Int = n1 - n2
    },
    MULTIPLE {
        override fun apply(n1: Int, n2: Int): Int = n1 * n2
    },
    DIVIDE {
        override fun apply(n1: Int, n2: Int): Int = if (n2!= 0) n1 / n2 else 0
    };

    abstract override fun apply(n1: Int, n2: Int): Int

    override fun applyAsInt(left: Int, right: Int): Int {
        return apply(left, right)
    }
}