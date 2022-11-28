fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    // enter your code
    val time = totalSeconds % 86400
    val hours = time / 3600
    val minutes = time % 3600 / 60
    val seconds = time % 3600 % 60
    print("$hours:$minutes:$seconds")
}