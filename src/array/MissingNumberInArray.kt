package array

/**
 * Created by Luthfan Maftuh on 10/03/2019.
 * Email luthfanmaftuh@gmail.com
 */
class MissingNumberInArray(title: String) {
    /**
     * To find missing numbers in integer array
     */
    init {
        println(title)

        val iArray = IntArray(5)
        iArray[0] = 1
        iArray[2] = 3
        /*val missingNumber = getMissingNumbers(iArray, iArray.size + 1)

        print("Missing number in array ${iArray.contentToString()} is $missingNumber")*/
        print("Missing numbers in array ${iArray.contentToString()} is ${getMissingNumbers(iArray)}")
    }

    /**
     * Just able to find one missing number in integer array without using Kotlin class collections
     * @param numbers   Array of integer
     * @param count     Size of $numbers + 1
     */
    private fun getMissingNumber(numbers: IntArray, count: Int): Int {
        val expectedSum = count * ((count + 1) / 2)
        var actualSum = 0

        for (number in numbers) actualSum += number

        return expectedSum - actualSum
    }

    /**
     * To find more than one missing numbers in integer array using Kotlin class collections
     * @param numbers   Array of integer
     */
    private fun getMissingNumbers(numbers: IntArray): String {
        var missingNumbers = ""

        for (i in 1..numbers.size) {
            if (!numbers.contains(i))
                missingNumbers += "$i, "
        }

        return missingNumbers
    }
}