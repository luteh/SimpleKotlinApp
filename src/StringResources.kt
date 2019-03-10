class StringResources {
    companion object {
        val title = "---List of Kotlin programming logic examples---"
        val label_enter_option = "Enter the option number: "
        val label_msg_not_in_list = "Your choice is not in the list!"

        val label_option_items = arrayOf(
                "1. Deret 1",
                "2. Fibonacci",
                "3. Find missing numbers in array"
        )

        fun getTitle(title: String): String {
            return "--$title--"
        }
    }
}