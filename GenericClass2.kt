//In Kotlin, generic classes are classes that can work with different types while maintaining type safety. 
//They allow you to create reusable components that can operate on various data types without sacrificing type correctness. Generics in Kotlin provide a way 
//to write more flexible and efficient code by avoiding code duplication for similar functionality with different types.



sealed class Ingredient {
    object Cheese : Ingredient()
    object Flour : Ingredient()
    object Egg : Ingredient()
    object Onion : Ingredient()
}

class Inventory<INGREDIENT : Ingredient> {
    private val contents: MutableList<INGREDIENT> = mutableListOf()

    fun addIngredient(ingredient: INGREDIENT) {
        contents.add(ingredient)
    }

    fun count(): Int {
        return contents.size
    }

    companion object {
        fun <INGREDIENT : Ingredient> newInventory(): Inventory<INGREDIENT> {
            return Inventory()
        }
    }
}

fun main() {
    val cheeseInventory = Inventory.newInventory<Ingredient.Cheese>() // Specify the ingredient type like this
    cheeseInventory.addIngredient(Ingredient.Cheese)
    cheeseInventory.addIngredient(Ingredient.Cheese)
    println(cheeseInventory.count())
}
