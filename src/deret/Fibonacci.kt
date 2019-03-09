package deret

import java.util.*

/**
 * Fibonacci program example
 */
class Fibonacci {
    fun onInit() {
        val sc = Scanner(System.`in`)

        print("Enter -n: ")
        val n = sc.nextInt()

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