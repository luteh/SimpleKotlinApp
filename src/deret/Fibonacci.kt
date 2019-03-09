package deret

import java.util.*

/**
 * Fibonacci program example
 */
class Fibonacci(title: String) {
    init {
        println(title)

        print("Enter -n: ")
        val n = Scanner(System.`in`).nextInt()

        for (i in 0..n) {
            print(" " + fibonacciCalculation(i))
        }
    }

    private fun fibonacciCalculation(i: Int): Int {
        return if (i < 2) 1
        else
            fibonacciCalculation(i - 1) + fibonacciCalculation(i - 2)
    }
}