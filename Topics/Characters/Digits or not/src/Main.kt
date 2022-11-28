const val TIMES = 4
fun main() {
    repeat(TIMES) {
        println(readln().first().isDigit())
    }
}