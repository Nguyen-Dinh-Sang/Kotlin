package datatypeandsyntax

fun main(args: Array<String>) {
    println("Data type and syntax")

    //var
    var x: Double = 5.0
    x = 1.5
    println("x = $x");

    //val
    val creditCarNumber = 123L
    println("credit car number $creditCarNumber")

    var test = 1_2_3L
    println("test _ $test")

    //null
    var a: Int?

    //Explicit conversions
    a = 5
    var b: Long?
    b = a?.toLong()

    //Compare: so sánh

        //== so sánh giá trị
    var c: Double = 0.0
    var d: Double = -0.0
    if (c == d) {
        println("a is equal to b")
    }

        //=== so sánh đồng nhất (giá trị bằng nhau và vùng nhớ bằng nhau)
    var z: Double = 10.0
    var a1: Double = z
    var a2: Double = z
    if (a1 === a2) {
        println("a1 is identical to a2")
    }

    //Boolean
    var boo = 100 > 1
    println(boo)
}