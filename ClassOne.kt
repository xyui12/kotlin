// Class is a template which tell how your objects is going to look alike
// and what properties a object will have when it is created. 


// below is the example of class without body. 

class Employee(val name:String,val id:Int,val position:String)

// it worked as constructor to create a object. 

fun main() {
    val employee = Employee("John",1,"Developer")
    println("${employee.name} ${employee.id}") // John 1
    println(employee.position)

}