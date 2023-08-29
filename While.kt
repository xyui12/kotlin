// The First loop you will learn about is the while loop. To a certain degree
// it is similiar to an if condition. Its structure is the same, except for using
// the while keyword instead of if.
// in both cases, if the predicate returns false, the body is never executed.file

fun main() {
    while(false){
        println("This won't be printed.")
    }
    if(false){
        println("This will also be not printed.")
    }

    //while(true){
       // print(".") // this prints "." every second until we stop it with ctrl+c or cmd +
   // }

   var toBePrinted=true
   while(toBePrinted){
        print("Will be printed Once")
        toBePrinted=false
   }

   var printedTimes=0
   while(printedTimes<=2){
    println("$printedTimes ")
    ++printedTimes
   }

   var i=1
   while(i*i<=100){
    println(i*i)
    i++
   }


}

