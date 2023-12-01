interface Puzzle {
    fun resultPart1(input: String): String

    fun resultPart2(input: String): String

    fun input(): String {
        return readResourceFile(javaClass.simpleName + ".txt")
    }

    fun testInput(): String {
        return readResourceFile(javaClass.simpleName + "-test.txt")
    }

    private fun readResourceFile(filePath: String): String {
        return object {}.javaClass.getResource(filePath)?.readText().orEmpty()
    }
}