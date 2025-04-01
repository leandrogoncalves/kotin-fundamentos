package enums

import enums.Month.JANUARY

fun main() {
    val month = JANUARY
    println("${month.numberOfMonth} = ${month.name} | order: ${month.ordinal}")

    var nextMonth = month.next().next()
    println(nextMonth)

    val month11 = Month.getEnumByNumberOfMonths(11)
    println(month11)

    val month8 = Month.valueOf("AUGUST")
    println(month8)

    println("The month ${month8} have ${nextMonth.getTotalDays()} days")
}

enum class Month(val numberOfMonth: Int) {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    fun getTotalDays(): Int {
        return when (this) {
            JANUARY, MARCH, MAY, JULY, OCTOBER, DECEMBER -> 31
            FEBRUARY-> 28
            else -> 30
        }
    }

    fun next(): Month {
        return Month
            .values()
            .find { it.numberOfMonth == numberOfMonth + 1}
            ?: JANUARY
    }

    companion object {
        fun  getEnumByNumberOfMonths(numberOfMonth: Int): Month {
            return entries
                .first { it.numberOfMonth == numberOfMonth}
        }
    }
}