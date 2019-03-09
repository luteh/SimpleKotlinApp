import StringResources.Companion.getTitle
import StringResources.Companion.label_enter_option
import StringResources.Companion.label_option_items
import StringResources.Companion.title
import deret.DeretTest1
import deret.Fibonacci
import java.util.*

fun main(args: Array<String>) {
    initView()
}

fun initView() {
    println(title)

    for (item in label_option_items) println(item)

    print(label_enter_option)
    val n = Scanner(System.`in`).nextInt()

    when (n) {
        1 -> DeretTest1(getTitle(label_option_items[n - 1]))
        2 -> Fibonacci(getTitle(label_option_items[n - 1]))
    }
}


