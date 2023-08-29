fun main() {
    val shoopingList = listOf("Tomato", "Potato", "Corriander")
    println(shoopingList)

    for (items in shoopingList) {
        println("I am going to buy $items")
    }

    val newShoppingList = shoopingList - "Potato" + "Okra"

    for (newitems in newShoppingList) {
        println("$newitems, ")
    }

    val ints = listOf<Int>(1, 2, 3)
    println(ints)
    println(ints.contains(1))

    // adding elements to list

    println(ints + 1)
    println(ints.size)

    // Empty list
    val list = listOf<String>()
    if (list.isEmpty()) {
        println("Empty List")
    } else {
        println("Not empty")
    }

    // Using mutable list

    val otherlist=mutableListOf("A","B")
    otherlist.add("C")
    println(otherlist)
    otherlist[1]="K"
    println(otherlist)
}
