package visibilitymodifiers.package1

private class ClassC {
    init {
        println("Initialize ClassC")
    }
}

fun accessClass() {
    var classC = ClassC()
}