package array

import java.util.*

/**
 * Created by Luthfan Maftuh on 17/03/2019.
 * Email luthfanmaftuh@gmail.com
 */
class CombineArrays(title: String) {
    init {
        println(title)

        val sc = Scanner(System.`in`)

        print("Enter array size: ")
        val arraySize = sc.nextInt()

        val mArray1 = IntArray(arraySize)
        val mArray2 = IntArray(arraySize)

        println("Enter array 1 and array 2 value: ")
        for (i in 0 until arraySize) {
            print("Array 1 [$i]: ")
            mArray1[i] = sc.nextInt()

            print("Array 2 [$i]: ")
            mArray2[i] = sc.nextInt()
        }

        println("Array 1: ${mArray1.contentToString()}")
        println("Array 2: ${mArray2.contentToString()}")
        print("Combined arrays result: ${combineArrays(mArray1, mArray2).contentToString()}")
    }

    /**
     * To combine two arrays one at a time alternately
     * @param   mArray1 1st array
     * @param   mArray2 2nd array
     * @return  IntArray as a combined arrays*/
    private fun combineArrays(mArray1: IntArray, mArray2: IntArray): IntArray {
        val mCombinedArray = IntArray(mArray1.size + mArray2.size)

        var n = 0
        for (i in 0 until mArray1.size) {
            mCombinedArray[n] = mArray1[i]
            n++

            mCombinedArray[n] = mArray2[i]
            n++
        }

        return mCombinedArray
    }
}