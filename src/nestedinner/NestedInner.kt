package nestedinner

class Fruit {
    private var heart: String = "❤"
    private var water: String = "\uD83D\uDCA7"
    private var monkey: String = "\uD83D\uDE48"

    class NestedClass {
        fun sayHello() {
            //heart cannot access
            println("Nested say hello")
        }
    }

    inner class InnerClass {
        fun sayHello() {
            println("Heart $heart")
            println("Water $water")
            println("Monkey $monkey")
        }
    }
}

fun main(args: Array<String>) {
    Fruit.NestedClass().sayHello()
    var fruit = Fruit()
    var innerClass = fruit.InnerClass()
    innerClass.sayHello()
}