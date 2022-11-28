fun main() {
    val numbers = readln().split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    val swap = numbers.last()
    numbers[numbers.size - 1] = numbers[0]
    numbers[0] = swap
    // Do not touch lines below
    print(numbers.joinToString(separator = " "))
}