// class with no paramters(no constructor)

class Student(){
    var name:String=""
    var id:Int=1
    var email:String=""

    fun display(){
        println("Name : $name")
        println("ID   : $id ")
        println("Email :$email")
        }
}

fun main() {
    var student1=Student() // object creation
    student1.display() // default value will be printed.
    student1.name="Sachin"
    student1.id=123
    student1.email="skprajapati3214@gmail.com"
    student1.display() // newly assigned value will be printed.

}