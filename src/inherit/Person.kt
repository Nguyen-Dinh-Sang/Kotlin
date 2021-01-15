package inherit

class Person (var firstName: String, var lastName: String) {
    private var fullName = "$firstName $lastName"

    fun hello() {
        println("Hello $fullName")
    }
}