fun main() {
    val num = readln().toInt()
    val left = readln().toInt()
    val right = readln().toInt()
    print(num in left..right || num in right..left)
}