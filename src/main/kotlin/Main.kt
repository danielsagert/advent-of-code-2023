import kotlin.system.measureTimeMillis

const val TEST_MODE = false

fun main() {
    println("Test mode: $TEST_MODE")
    val puzzle = Day01()
    execute(puzzle, 1)
    println("-----")
    execute(puzzle, 2)
}

private fun execute(puzzle: Puzzle, part: Int) {
    val input = if (TEST_MODE) puzzle.testInput(part) else puzzle.input(part)

    val duration = measureTimeMillis {
        val result = puzzle.execute(part, input)
        println("Result part $part: $result")
    }
    println("Duration part $part: $duration ms")
}