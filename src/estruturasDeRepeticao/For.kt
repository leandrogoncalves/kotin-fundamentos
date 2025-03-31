package estruturasDeRepeticao

fun main() {
//    for (i in 1..10) {
//        print("$i ")
//    }

    println()

//    for (i in 10 downTo 0 step 2) {
//        print("$i ")
//    }

    println()

//    for (i in 10 until 100 step 3) {
//        print("$i ")
//    }

    println()

//    repeat(10) {
//        print("$it")
//    }

    /*
    print("> ")
    val n = readln().toInt()
    var m = 10
    for (i in 1..m) {
        println("$n x $i = ${n * i}")
    }
    */

    loop@ for (i in 'A'..'E') {
        for (j in 1..5) {
            print("$i$j ")
            if (j == 3) {
                continue@loop
            }
        }
        println()
    }
    println(" Fim")
}