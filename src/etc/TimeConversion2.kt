package etc

import java.text.SimpleDateFormat
import java.util.*

class TimeConversion2(title: String) {

    init {
        println(title)

        print("Enter a time in format hh:mm:ssAM or hh:mm:ssPM : ")
        val times = Scanner(System.`in`).next()

        println("Converted time result: ")
        print(timeConversion(times))
    }

    private fun timeConversion(s: String): String {
        val oldDateFormat = SimpleDateFormat("hh:mm:ssa")
        val newDateFormat = SimpleDateFormat("HH:mm:ss")

        return newDateFormat.format(oldDateFormat.parse(s))
    }
}