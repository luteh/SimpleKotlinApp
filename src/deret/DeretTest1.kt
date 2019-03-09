package deret

import java.util.*

/**
 * Deret program example
 */
fun onInitDeretTest1(title: String) {
    println(title)

    print("Enter a -n: ")
    val n = Scanner(System.`in`).nextInt()

    var deret = 0

    for (i in 0..n) {
        if (i % 2 != 0) deret -= 3 else deret += 5

        print("$deret ")
    }
}