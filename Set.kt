// set don't have duplicate items. if you add similiar item it will remove it. 

class User(val name:String)

data class DataUser(val name:String)

fun main() {
    val set=setOf('A','B','C')
    println(set+'B')

    println(set+setOf('B','D'))

    // Two elements are duplicate if they are equal, so if
    // == between them returns true. Since regular classes 
    // are considered unique, they are never considered to be duplicates. 


    val otherSet=setOf(User("A"),User("A"))
    println(otherSet + User("A"))


    // Data classes are equal when their all-constructor properties have the same values. 

    val dataSet=setOf(DataUser("B"))
    println(dataSet+DataUser("B"))

    // Check if a set contains an element 

    val letters=setOf('A','B','C')
    println(letters.contains('Z'))
    println(letters.contains('C'))
    println('A' in letters)
    println('Z' in letters)

    // You can also check the opposite to determine if the
    // the set does not contain the elementby using, by using
    // !in operator. 

   println('D' !in letters)
   println('A' !in letters)


   // Iterating over sets 

   for (l in letters){
    print("$l ")
   }


   // Using mutable set : 
   // set is a type reperesenting read-only sets. 
   // if you want to create a mutable set,
   // use mutableSetof, and the result type is MutableSet. 
   // with mutable set, you can use methods like add or remove. 

   val mutabSet=mutableSetOf('A','B')
   mutabSet.add('C')
   println(mutabSet)
   mutabSet.remove('B')
   println(mutabSet)


   // 


}