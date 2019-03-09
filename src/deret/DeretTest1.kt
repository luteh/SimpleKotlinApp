package deret

import java.util.*

fun onInitDeretTest1() {
    val sc = Scanner(System.`in`)

    print("Enter a -n: ")
    val n: Int = sc.nextInt()

    var deret = 0

    for (i in 0..n) {
        if (i % 2 != 0) deret -= 3 else deret += 5

        print("$deret ")
    }
}