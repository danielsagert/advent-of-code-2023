class Day02 : Puzzle {
    private val maxCountsPerColor = mapOf(
        "red" to 12,
        "green" to 13,
        "blue" to 14
    )

    override fun executePart1(input: String): String {
        return input.lineSequence()
            .filterNot(String::isNullOrEmpty)
            .filter(::isValidGame)
            .map(::getGameId)
            .sum()
            .toString()
    }

    private fun isValidGame(line: String): Boolean {
        val sets = line.substringAfter(":").split(";")
        sets.forEach { set ->
            val colors = set.trim().split(",")
            colors.forEach {
                val (count, color) = it.trim().split(" ")
                val maxCount = maxCountsPerColor.getOrDefault(color, 0)
                if (count.toInt() > maxCount) return false
            }
        }

        return true
    }

    private fun getGameId(line: String): Int = line.substringBefore(":")
        .split(" ")[1]
        .toInt()

    override fun executePart2(input: String): String {
        return "Not yet implemented"
    }
}