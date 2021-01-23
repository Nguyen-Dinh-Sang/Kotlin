package function

fun Array<String>.printUpperCase() {
    for (index: String in this) {
        println(index.toUpperCase())
    }
}