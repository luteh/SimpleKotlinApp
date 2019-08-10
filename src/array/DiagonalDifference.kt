package array

import java.util.*

/**
 * Created by Luthfan Maftuh on 10/08/2019.
 * Email luthfanmaftuh@gmail.com
 */

/**
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.

    For example, the square matrix arr is shown below:

    1 2 3
    4 5 6
    9 8 9
    The left-to-right diagonal = 1 + 5 + 9 = 15. The right to left diagonal = 3 + 5 + 9 = 17. Their absolute difference is
    |15 - 17| = 2.

    Function description

    Complete the diagonalDifference function in the editor below. It must return an integer representing the absolute diagonal difference.

    diagonalDifference takes the following parameter:

    arr: an array of integers .
    Input Format

    The first line contains a single integer, n, the number of rows and columns in the matrix arr.
    Each of the next n lines describes a row, arr[i], and consists of n space-separated integers arr[i][j].

    Constraints
    -100 <= arr[i][j] <= 100

    Output Format

    Print the absolute difference between the sums of the matrix's two diagonals as a single integer.

    Sample Input

    3
    11 2 4
    4 5 6
    10 8 -12
    Sample Output

    15
    Explanation

    The primary diagonal is:

    11
    5
    -12
    Sum across the primary diagonal: 11 + 5 - 12 = 4

    The secondary diagonal is:

    4
    5
    10
    Sum across the secondary diagonal: 4 + 5 + 10 = 19
    Difference: |4 - 19| = 15

    Note: |x| is the absolute value of x
 */
class DiagonalDifference(title: String) {

    init {
        println(title)

        print("Enter n for the number of rows and columns matrix: ")
        val n = Scanner(System.`in`).nextInt()
        val arr = Array(n) { Array(n) { Random().nextInt(10) } }

        println("Rows and Columns = $n")
        for (i in 0 until arr.size) {
            for (j in 0 until arr.size) {
                print("${arr[i][j]} ")
            }
            println()
        }

        val result = diagonalDifference(arr)

        println("Result: ")
        print(result)
    }

    private fun diagonalDifference(arr: Array<Array<Int>>): Int {
        var leftDiagonal = 0
        var rightDiagonal = 0

        var rightCounter = arr.size - 1

        for (i in 0 until arr.size) {
            leftDiagonal += arr[i][i]
            rightDiagonal += arr[i][rightCounter]
            rightCounter--
        }

        return if (leftDiagonal >= rightDiagonal)
            leftDiagonal - rightDiagonal
        else
            rightDiagonal - leftDiagonal
    }


}