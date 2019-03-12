package string

import java.util.*
import kotlin.collections.HashMap

/**
 * Created by Luthfan Maftuh on 12/03/2019.
 * Email luthfanmaftuh@gmail.com
 */

/**
 * Find duplicate characters in String
 */
class FindDuplicateCharacters(val title: String) {
    init {
        println(title)

        print("Type any word: ")
        val str = Scanner(System.`in`).nextLine()

        printDuplicateCharacters(str)
    }

    /**
     * To print duplicate characters in String $str
     * @param str   String value inputted by user
     */
    private fun printDuplicateCharacters(str: String?) {
        val chars = str!!.toLowerCase().toCharArray()

        val charMap: HashMap<Char, Int> = HashMap()

        for (char in chars)
            charMap[char] = if (charMap.containsKey(char)) (charMap[char]!! + 1) else 1

        println("Duplicate Characters list in String \"$str\" : ")
        for (map in charMap) {
            if (map.value > 1 && map.key != ' ')
                println("${map.key}: ${map.value}")
        }
    }
}