object StringResources {
        val title = "---List of Kotlin programming logic examples---"
        val label_enter_option = "Enter the option number: "
        val label_msg_not_in_list = "Your choice is not in the list!"
        val label_example = "-Example-"

        val label_option_items = arrayOf(
                "1. Deret 1",
                "2. Fibonacci",
                "3. Find missing numbers in array",
                "4. Count Per Digits",
                "5. Find duplicate characters in String",
                "6. Shifting Integer Array",
                "7. Convert xxxxx seconds to xx hours xx mintues xx seconds",
                "8. Combine Arrays",
                "9. Extra Long Factorials"
        )

        fun getTitle(title: String): String {
            return "--$title--"
        }
}