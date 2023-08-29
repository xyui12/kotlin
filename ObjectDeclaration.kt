// You create object in android studion by choose object option
// during file creation. There are several options during like class, object, interface or .kt file. 


object RestaurantTables{
    val customers:MutableList<String> =mutableListOf()

    fun addCustomer(customerName : String){
        customers.add(customerName)
    }
    fun removeCustomer(customerName: String){
        customers.remove(customerName)
    }
}

fun main() {
    RestaurantTables.addCustomer("Sachin")
    RestaurantTables.addCustomer("Divyansh")
    RestaurantTables.addCustomer("Tushar")

    for(person in RestaurantTables.customers){
        println("$person is coming to our restaurant.")
    }

}