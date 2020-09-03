package ifwhenforwhile

fun main(args: Array<String>) {
    //If else
    var numberA: Double = 7.0
    var numberB: Double = 6.0

    if (numberA > numberB) {
        println("NumberA is larger than equal numberB")
    } else {
        println("NumberA is smaller than equal numberB")
    }

    var aString = if (numberA > numberB) "larger" else "smaller"

    println("aString $aString")

    //"When" as a variable, like switch..case in C
    var c: Char = 'a'

    var stringResult: String = when(c) {
        'a' -> "First character of the alphabet"
        'z' -> "Last character of the alphabet"
        else -> "other character"
    }

    println("String Result: $stringResult")

    //Use "when" as a function
    fun checknumber(inputNumber: Int) = when(inputNumber) {
        0 -> {
            println("This is zero")
        }
        1,2 -> {
            println("One or two")
        }
        in 3..10 -> println("A few, several")
        else -> println("Many")
    }

        //Call function
    checknumber(1)

    //For loop
    var intNumbers: Array<Int> = arrayOf(10, 20, 30, 40)
    for (intNumber in intNumbers) {
        println("intNumber $intNumber")
    }

    //Using indices
    for (index in intNumbers.indices) {
        println("Value at index = $index is ${intNumbers[index]}")
    }

    //Using index, value pair
    println()
    for ((index, value) in intNumbers.withIndex()) {
        println("Value at index = $index is $value")
    }

    //while
    var x: Long = 10
    while (x > 0) {
        x--
        println("x = $x")
    }
}