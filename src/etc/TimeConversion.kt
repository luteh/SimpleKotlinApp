package etc

import java.util.*

/**
 * Created by Luthfan Maftuh on 14/03/2019.
 * Email luthfanmaftuh@gmail.com
 */
class TimeConversion(title: String) {
    init {
        println(title)

        print("Enter total seconds: ")
        val totalSeconds = Scanner(System.`in`).nextInt()

        println("Converted time result: ")
        print(getConvertedTime(totalSeconds))
    }

    /**
     * To convert total seconds which has been inputted by user
     * @param   totalSeconds    Total seconds
     * @return  String of converted time
     */
    private fun getConvertedTime(totalSeconds: Int): String {
        val day: Int
        val hour: Int
        val minute: Int
        val second: Int
        var remainingTotalSeconds: Int

        day = totalSeconds / 86400 // Convert totalSeconds to day
        remainingTotalSeconds = totalSeconds % 86400 // remaining values of totalSeconds which has been reduced by days

        hour = remainingTotalSeconds / 3600 // Convert remaining totalSeconds to hours
        remainingTotalSeconds = totalSeconds % 3600 // Remaining values of totalSeconds which has been reduced by hours

        minute = remainingTotalSeconds / 60 // Convert remaining totalSeconds to minutes

        // Remaining values of totalSeconds which has been reduced by minute
        // The result will be the Seconds
        second = remainingTotalSeconds % 60

        return "$day days $hour hours $minute minutes $second seconds"
    }
}