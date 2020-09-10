package `class`

fun main(args: Array<String>) {
    var person = Person("Nguyen", "Sang")
    println("Person first name: ${person.firstName}")
    println("Person last name: ${person.lastName}")
    person.fullName()
}


