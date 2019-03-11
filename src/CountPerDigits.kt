import java.util.*

/**
 * Created by Luthfan Maftuh on 11/03/2019.
 * Email luthfanmaftuh@gmail.com
 */

/**
 * Counting per digit of value that inputted by user
 * @sample
 * Input    : 23
 * Output   : 6
 */
class CountPerDigits(title: String) {
    init {
        println(title)

        println(StringResources.label_example)
        println("User input: 347")
        println("Expected output: 84")

        print("Enter n: ")
        val n = Scanner(System.`in`).nextInt()

        print("Output: ${getOutput(n)}")
    }

    /**
     * To multiply per digit from $n value
     * @param n     User input
     * @return      Multiplication result sum
     */
    private fun getOutput(n: Int): Int {
        var number = n
        var sumNumbers = 1

        while (number > 0) {
            sumNumbers *= (number % 10)
            number /= 10
        }

        return sumNumbers
    }
}