package inherit

open class Person (open var firstName: String, var lastName: String) {

    open fun hello() {
        println("Hello $firstName $lastName")
    }
}