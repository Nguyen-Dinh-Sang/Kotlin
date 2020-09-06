package breakandcontinueandreturn

fun main(args: Array<String>) {
    //Break
    val ints: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    for (int in ints) {
        if (int == 4) {
            break
        }
        println("Int $int")
    }

    labelOne@ for (i in 1..10) {
        for (j in 1..20) {
            if (i == 5 && j ==5 ) {
                break@labelOne
            }
            println("i = $i, j = $j")
        }
    }

    //Contiune
    for (int in ints) {
        if (int == 4) {
            continue
        }
        println("Int $int")
    }

    //return
    fun printInteger(intArray: Array<Int>) {
        intArray.forEach(fun(item: Int) {
            if (item == 3) return
            println("Item $item")
        })
    }

    printInteger(ints)
}