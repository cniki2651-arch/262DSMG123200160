fun main() {
    println(isSpendingMoreTimeOnPhone(timeSpentToday = 300, timeSpentYesterday = 250))
    println(isSpendingMoreTimeOnPhone(timeSpentToday = 300, timeSpentYesterday = 300))
    println(isSpendingMoreTimeOnPhone(timeSpentToday = 200, timeSpentYesterday = 220))
}

fun isSpendingMoreTimeOnPhone(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}
