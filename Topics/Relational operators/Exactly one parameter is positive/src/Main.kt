fun main() {
    val first = readln().toInt() > 0
    val second = readln().toInt() > 0
    val third = readln().toInt() > 0
    print(first xor second && !third || !(first || second) && third)
}