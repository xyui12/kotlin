

fun main() {

    val a=0
    val b=5
    for(i in a..b){
        println("for loop $i")
    }

    for(i in a until b){
        println("$i ") //print function is used to display the value of variable i.
    }

    for(i in b downTo a){
        println("$i ")//downto is used to iterate from high number to low numbers, it
    }

    val c=3

    for(i in a..b step c){
        println(i)
    }


}