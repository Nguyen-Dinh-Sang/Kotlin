package visibilitymodifiers.package2

class SubClassD : ClassD() {
    override var test = 5
    init {
        println("Test $test")
    }
}