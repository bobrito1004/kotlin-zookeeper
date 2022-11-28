@Suppress("MagicNumber")
fun findYears(depo: Double): Int {
    var deposit = depo
    val max = 700000
    var years = 0
    while (deposit <= max) {
        deposit *= 1.071
        ++years
    }
    return years
}