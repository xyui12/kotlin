data class OrderItem(val name: String, val price: Double)

class TaxCalculator {

    companion object {
        val salesTaxPercentage = 15.0
        fun getTaxAmountForOrderItems(orderItemList: List<OrderItem>): Double {
            var orderAmount: Double = 0.00

            for (amount in orderItemList) {
                orderAmount +=amount.price
            }

            return orderAmount * salesTaxPercentage / 100
        }
    }


}

fun main() {
    val orderItems = listOf(
        OrderItem("Burger", 8.00),
        OrderItem("Fries", 4.00),
        OrderItem("Soda", 2.00)
    )

    println(TaxCalculator.getTaxAmountForOrderItems(orderItems))
}