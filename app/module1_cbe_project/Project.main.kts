fun main() {
    println("--- Challenge 1 ---")
    calculateMoMoFee(4000, 10000)
    calculateMoMoFee(70000, 50000)


}

fun calculateMoMoFee(amount: Int, balance: Int) {
    val fee = when (amount) {
        in 0..5000 -> 500
        in 5001..60000 -> 1000
        else -> 2000
    }

    if (amount + fee <= balance) {
        println("Transaction successful. Fee: $fee")
    } else {
        println("Insufficient Funds")
    }
}




