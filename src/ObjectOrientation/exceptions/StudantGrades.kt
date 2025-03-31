package ObjectOrientation.exceptions

fun main() {
    try {
        val avg = StudantGrades()
            .add(-3.0)
            .add(5.5)
            .add(7.0)
            .average()

        println(avg)
    } catch (e: Exception) {
        println("Error: ${e.message}")
        e.printStackTrace()
    }
}

class StudantGrades {
    private var sum: Double = 0.0
    private var numberOfGrades: Int = 0

    fun add(grade: Double): StudantGrades {
//        if (grade !in 0.0..10.0) {
//            throw IllegalArgumentException("Invalid grade: $grade")
//        }
        require(grade !in 0.0..10.0) {
            "Grade $grade must be between 0 and 10"
        }
        sum += grade
        numberOfGrades++
        return this
    }

    fun average(): Double = sum / numberOfGrades
}