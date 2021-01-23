package extensions

import function.printUpperCase

fun main(args: Array<String>) {
    var stringsTest: Array<String> = arrayOf("one", "two", "three", "four", "five")
    stringsTest.printUpperCase()
    var b = B()
    b.methodB()
    var a = A()
    a.callMethodB2(b)
}

class A {
    fun methodA() {
        println("method A of class A")
    }

    fun B.methodB2() {
        methodA()
        this@A.methodA()
    }

    fun callMethodB2(b: B) {
        b.methodB2()
    }
}

class B {
    fun methodB() {
        println("method A of class B")
    }
}