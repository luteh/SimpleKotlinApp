class StringResources {
    companion object {
        val title = "---List of Kotlin programming logic examples---"
        val label_enter_option = "Enter the option number: "

        val label_option_items = arrayOf(
                "1. Deret 1",
                "2. Fibonacci"
        )

        fun getTitle(title: String): String {
            return "--$title--"
        }
    }
}