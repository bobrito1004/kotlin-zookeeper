fun main() {
    val first = readln().first().code
    val second = readln().first().code
    val third = readln().first().code
    print(first == second - 1 && second == third - 1)
}