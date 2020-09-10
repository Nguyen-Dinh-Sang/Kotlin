package `class`

//Basic
//class Person {
//
//}

//Constructor
//class Person constructor(var name: String, var age: Int)

//class Person (var name: String, var age: Int)

//initialize blocks
//class Person (var name: String, var age: Int) {
//    init {
//        println("Hello $name")
//    }
//}

//private property
class Person (var firstName: String, var lastName: String) {
    private var fullName = "$firstName $lastName"

    ///function puclic
    fun fullName() {
        println("Full name $fullName")
    }
}