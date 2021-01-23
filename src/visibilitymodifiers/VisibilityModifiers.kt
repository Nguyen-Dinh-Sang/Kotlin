package visibilitymodifiers

import visibilitymodifiers.package1.ClassA
import visibilitymodifiers.package1.ClassB
import visibilitymodifiers.package1.function1
import visibilitymodifiers.package1.function2

fun main(args: Array<String>) {
    var classB = ClassB()
    function1()
    function2()
//    var classC = ClassC();
//    function3()
    println("Pi: ${TestStatic.pi}")
    TestStatic.test()
}
