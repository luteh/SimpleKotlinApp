package etc

import java.math.BigInteger
import java.util.*

class ExtraLongFactorials(title: String) {
    init {
        println(title)

        print("Enter n Factorials: ")
        val n = Scanner(System.`in`).nextInt()

        println("$n! = ")
        print(extraLongFactorials(n))
    }

    private fun extraLongFactorials(n: Int): BigInteger {
        var value: BigInteger = 1.toBigInteger()
        for (x in n downTo 1) {
            value *= x.toBigInteger()
        }
        return value
    }
}