package geterseter

class Person() {
    var firstName: String
        get() {
            return "return value"
        }
        set(value) {
            println("Data $value")
        }
}