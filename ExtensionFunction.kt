// Extension Functions: Whenever you need to extend the functionalities of a class
// or an interface and an external or a third party library that you can not inherit
// from or modify, you use extension functions. 


// Here Dish is the class and printIngredients and remove salt are
// extension function to Dish class. 
class Dish(
    val dishName:String,
    val ingredients:MutableList<String>
)

fun Dish.printIngredients(){
    println(ingredients)
}

fun Dish.removeSalt(){
    ingredients.remove("Salt")
}

fun main() {
    val onionSoup=Dish("Onion Soup", mutableListOf("Onion","Cheese","Water","Salt"))
    println("Ingredients before salt removal: "+onionSoup.printIngredients())
    onionSoup.removeSalt()
    println("Ingredients after salt removal: "+onionSoup.printIngredients())
    
}