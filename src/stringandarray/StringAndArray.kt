package stringandarray

fun main(args: Array<String>) {
    //char
    var c: Char = 'c'
    println("Char $c")

    //special characters http://www.fileformat.info/info/charset/UTF-8/list.htm
    //@	COMMERCIAL AT (U+0040)
    c = '\u0040'
    println("Char set $c")

    //String
    var myName = "Sang"
    println("My name $myName")

    var fullName: String = "Nguyễn Đình Sang"
    println("Full name $fullName")

    for (eachChar in fullName) {
        println("Each char $eachChar")
    }

    //trimmargin lọc ký tự |
    var text = """|line 1
|line 2""".trimMargin("|")
    println("More lines $text")

    //Array
    var strings: Array<String> = arrayOf("a", "b", "c", "d")
    for (string in strings) {
        println("String $string")
    }

    var intNumbers: Array<Int> = Array<Int>(size = 5, init = { i -> i * 2 })
    //{ i -> i * 2 } no name function
    //  i input prarams of function
    //       i * 2 implementation of function

    for (intNumber in intNumbers) {
        println("Int number $intNumber")
    }
}