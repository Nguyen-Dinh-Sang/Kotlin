package visibilitymodifiers

class TestStatic {
    companion object {
        var pi: Float = 3.14F
        fun test() {
            println("Static function")
        }
    }
}