package function

fun main(args: Array<String>) {
//    fun addTwoInts(x: Int, y: Int): Int {
//        return x + y
//    }

    fun addTwoInts(x: Int, y: Int): Int = x + y
    println("Add 2 number: ${addTwoInts(10, 20)}")

    fun rectangularArea(width: Double, height: Double = 10.0): Double {
        return width * height
    }

    println("Rectangular area: ${rectangularArea(10.0)}")

    fun hello(name: String): Unit {
        println("Hello $name")
    }

    hello("Sang")

    fun inputUnknown(vararg ints: Int) {
        for (int in ints) {
            println("Int $int")
        }
    }

    inputUnknown(1)
    inputUnknown(1, 2, 3)

    infix fun Int.plus(x: Int): Int {
        return this + x
    }

    println("2 + 2 = ${2 plus 2}")

    tailrec fun factorial(n: Long = 1): Long {
        if (n == 1L) {
            return 1
        } else {
            return n * factorial(n -1)
        }
    }

    println("N! ${factorial(1000)}")
}