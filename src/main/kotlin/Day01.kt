class Day01 : Puzzle {
    override fun resultPart1(input: String): String {
        return input.lineSequence()
            .filterNot(String::isNullOrEmpty)
            .map { s -> s.filter { it.isDigit() } }
            .map { s -> "" + s.first() + s.last() }
            .map { it.toInt() }
            .sum()
            .toString()
    }

    override fun resultPart2(input: String): String {
        return "Not yet implemented"
    }
}