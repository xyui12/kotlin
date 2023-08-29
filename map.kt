// The result type is MAP<Key,Value>
// Map represents an unordered collection of key-value pairs. 
// Keys are unique and each of them maps to exactly one value. The values can have duplicates. 

fun main() {
    val capitals: Map<String,String> =mapOf("USA" to "Washington","Poland" to "Warsaw")
    println(capitals)

    // Finding a value for a key 
    val city:String?=capitals["USA"]
    println(city)
    println(capitals["Poland"])
     
    // directly you cannot add elements to map because it is immutable 
    // but you can copy it in other. 
    // Beware duplicates are not allowed. 

    val newCap=capitals + ("India" to "NewDelhi")
    println(newCap)

    // Checking if a map contains a key. 
    println("USA" in capitals)

    // Checking map size 
    println(capitals.size)

    // Iterating over maps
    for(entry in capitals){
        println("${entry} ")
        println("${entry.key} ")
        println("${entry.value} ")
    }
    // You can also restructure an entry into two variable. Kotlin supports restructuring in a for-loop 
    for((l,m) in capitals){
        print("$l $m\n")
    }

    // Mutable Map

    // You can add new association to it using the put method or box bracket and assignment. 
    // You can also remove an association by key using the remove method. 

    val map:MutableMap<Char,String> =mutableMapOf('A' to "Alex",'B' to "Bob")
    map.put('C' ,"Celina")
    map['D']="Daria"
    println(map)
    map.remove('B')
    println(map)
    


}
