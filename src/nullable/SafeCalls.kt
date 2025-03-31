package nullable

fun main() {
    val s1: String? = "abcde"
//    println(s1)
//
//    val s2 = s1?.uppercase()
//    println(s2)
//
//    var s3 = s1?.reversed()
//    println(s3)
//
//    val s4 = s2?.length
//    println(s4)

    if (s1 != null) {
        println(s1)

        val s2 = s1.uppercase()
        println(s2)

        var s3 = s1.reversed()
        println(s3)

        val s4 = s2.length
        println(s4)
    }
}