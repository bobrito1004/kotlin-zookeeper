import kotlin.math.abs

fun main() {
    val first = readln().split(' ')
    val second = readln().split(' ')
    print(
        if (first.first() == second.first() ||
            first.last() == second.last() ||
            abs(first.first().toInt() - second.first().toInt()) ==
            abs(first.last().toInt() - second.last().toInt())
        ) "YES" else "NO"
    )
}