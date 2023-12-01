import kotlin.system.measureTimeMillis

val puzzle = Day01()
const val TEST_MODE = false

fun main() {
    val input = if (TEST_MODE) puzzle.testInput() else puzzle.input()

    val durationPart1 = measureTimeMillis {
        println("Result part 1: ${puzzle.resultPart1(input)}")
    }
    println("Duration part 1: $durationPart1 ms")

    println("-----")

    val durationPart2 = measureTimeMillis {
        println("Result part 2: ${puzzle.resultPart2(input)}")
    }
    println("Duration part 2: $durationPart2 ms")
}