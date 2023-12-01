interface Puzzle {
    fun execute(part: Int, input: String): String {
        return when (part) {
            1 -> executePart1(input)
            2 -> executePart2(input)
            else -> "Invalid part (1 or 2, but was $part)"
        }
    }

    fun executePart1(input: String): String

    fun executePart2(input: String): String

    fun input(part: Int): String {
        val day = javaClass.simpleName.lowercase()
        return readResourceFile("$day/$part.txt")
    }

    fun testInput(part: Int): String {
        val day = javaClass.simpleName.lowercase()
        return readResourceFile("$day/$part-test.txt")
    }

    private fun readResourceFile(filePath: String): String {
        return object {}.javaClass.getResource(filePath)?.readText().orEmpty()
    }
}