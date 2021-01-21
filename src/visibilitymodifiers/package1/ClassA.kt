package visibilitymodifiers.package1

public class ClassA {
    init {
        println("Initialize ClassA")
        function2()
        function3()
    }

}

public fun function1() {
    println("Function 1")
}

internal fun function2() {
    println("Function 2")
}

private fun function3() {
    println("Function 1")
}

private var x = 100