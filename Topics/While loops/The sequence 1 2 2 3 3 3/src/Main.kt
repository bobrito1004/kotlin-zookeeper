fun main() {
    var times = readln().toInt()
    var num = 1
    while (true) {
        repeat(num) {
            print("$num ")
            times--
            if (times == 0) return
        }
        num++
    }
}
