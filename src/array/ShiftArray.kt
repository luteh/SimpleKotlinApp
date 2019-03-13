package array

import java.util.*

/**
 * Created by Luthfan Maftuh on 13/03/2019.
 * Email luthfanmaftuh@gmail.com
 */
class ShiftArray(title: String) {
    /**
     * Shifting integer array
     * Example:
     *
     * Input:
     * int[] arr1 = {3,5,7,9,12}
     * int shift = 2
     *
     * Output:
     * {7,9,12,3,5}
     */
    init {
        val sc = Scanner(System.`in`)

        println(title)

        print("Input array integer size: ")
        val arrayInt = IntArray(sc.nextInt())
        println("Input array integer value: ")
        for (i in 0 until arrayInt.size) {
            print("Array[$i]: ")
            arrayInt[i] = sc.nextInt()
        }

        println("Your array is: ${arrayInt.contentToString()}")

        print("Enter shift range: ")
        val shiftRange = sc.nextInt()

        print("Your shifted array are: ${shiftingArray(arrayInt, shiftRange)}")
    }

    /**
     * To shifting array $arrayInt according to $shiftRange value
     * @param   arrayInt      Initial array
     * @param   shiftRange    Shifting range
     * @return  String of shifted array
     */
    private fun shiftingArray(arrayInt: IntArray, shiftRange: Int): String {
        val shiftedArray = IntArray(arrayInt.size)
        var n = shiftRange

        for (i in 0 until arrayInt.size) {
            if (n >= arrayInt.size)
                n = 0
            shiftedArray[i] = arrayInt[n]
            n++
        }

        return shiftedArray.contentToString()
    }
}