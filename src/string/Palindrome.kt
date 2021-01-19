package string

import java.util.*

class Palindrome(title: String) {

    init {
        println(title)

        print("Enter string: ")
        val str = Scanner(System.`in`).next()

        println("Result -> ${isPalindrome(str)}")
    }

    private fun isPalindrome(text: String, position: Int = 0): Pair<Boolean, String> {
        val length = text.length
        val forwardStr = text.substring(position, length)
        val backwardStr = text.reversed().substring(0, length - position)
        val comparedStr = "$forwardStr <-> $backwardStr"

        println("forwardStr = $forwardStr")
        println("backwardStr = $backwardStr")

        if (forwardStr == backwardStr) return Pair(true, comparedStr)

        val nextPosition = position + 1
        if (nextPosition < text.length - 1) {
            return isPalindrome(text, nextPosition)
        }
        return Pair(false, comparedStr)
    }
}