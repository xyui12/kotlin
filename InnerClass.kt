// A nested class marked with the keyword 'inner' is called an inner class. 
// Kotlin provides a keyword inner which when added to a nested
// class allows it to access the memeber of the outer class. 

class Order(val orderAmount: Int){

    inner class TaxDetails{
        val taxAmount=0.05*orderAmount
    }
}


fun main() {
    val order=Order(100)
    val taxDetails=order.TaxDetails()
    println(taxDetails.taxAmount)

    // you can print it like this also. 

    println(Order(100).TaxDetails().taxAmount)
}