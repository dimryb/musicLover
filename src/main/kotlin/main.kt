fun main() {
    val currentPrice = 2324
    val totalPrice = 95308
    val isMusicLover = true
    val fixDiscountStart = 1000
    val fixDiscount = 100
    val presentDiscountStart = 10000
    val presentDiscount = 0.05
    val musicLoverDiscount = 0.01

    val discount: Int = when {
        (totalPrice > presentDiscountStart) -> (currentPrice * presentDiscount).toInt()
        (totalPrice > fixDiscountStart) -> fixDiscount
        else -> 0
    }
    val result = currentPrice - discount
    val generalResult = if (isMusicLover) (result - result * musicLoverDiscount) else result

    println("Total $generalResult")
}
