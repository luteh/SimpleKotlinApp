import StringResources.getTitle
import StringResources.label_enter_option
import StringResources.label_msg_not_in_list
import StringResources.label_option_items
import StringResources.title
import array.CombineArrays
import array.DiagonalDifference
import array.MissingNumberInArray
import array.ShiftArray
import deret.DeretTest1
import deret.Fibonacci
import etc.ExtraLongFactorials
import etc.TimeConversion
import etc.TimeConversion2
import string.FindDuplicateCharacters
import string.Palindrome
import java.util.*

fun main(args: Array<String>) {
    initView()
}

fun initView() {
    println(title)

    for (item in label_option_items) println(item)

    print(label_enter_option)
    val n = Scanner(System.`in`).nextInt()
    val title = getTitle(label_option_items[n - 1])

    when (n) {
        1 -> DeretTest1(title)
        2 -> Fibonacci(title)
        3 -> MissingNumberInArray(title)
        4 -> CountPerDigits(title)
        5 -> FindDuplicateCharacters(title)
        6 -> ShiftArray(title)
        7 -> TimeConversion(title)
        8 -> CombineArrays(title)
        9 -> ExtraLongFactorials(title)
        10 -> TimeConversion2(title)
        11 -> DiagonalDifference(title)
        12 -> Palindrome(title)
        else -> print(label_msg_not_in_list)
    }
}


