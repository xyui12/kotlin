

import OtherOrder// Nested Class: A class defined within a class is called a nested class. 
// It is also important to note that the nested class cannot access the memeber of the outer class, 
// but the outer class can access the members of the nested class. 

class OtherOrder{
    val orderid=1

    class DeliveryDetails{
        // val deliveryFeeDollars=10*orderid  // not possible 
        // because nested cannot access outer class memebers. 
        
        
        val deliveryFeeDollars= 10
        
    }
}


fun main() {
    
    println(OtherOrder.DeliveryDetails().deliveryFeeDollars)


}