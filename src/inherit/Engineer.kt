package inherit

class Engineer(var fielOfStudy: String, firstName: String, lastName: String) : Person(firstName, lastName) {
    override var firstName = super.firstName.toUpperCase()

    override fun hello() {
        super.hello()
        println("I am engineer")
    }
}