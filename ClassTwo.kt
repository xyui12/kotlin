// Below is the example of class with body

class Employee1(val name:String, val id:Int,val position:String){
    
    val email:String="skprajapati3214@gmail.com"

    fun displayALL(){
        println("Name : $name")
        println("ID   : $id ")
        println("Position  :$position")
        println("Email :$email")
        }
        //Below method will be called when object created.
}

fun main() {
    var emp = Employee1("Sachin",123,"Developer");
    emp.displayALL();
    println(emp.email)

}