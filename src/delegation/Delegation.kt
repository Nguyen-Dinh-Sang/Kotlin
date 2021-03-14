package delegation

interface BirdInterface {
    fun flyAndFindFood()
}

class Eagle(val age: Int) : BirdInterface {
    override fun flyAndFindFood() {
        println("I am an Eagle. I am $age years old. I am flying and finding food")
    }
}

class Cuckoo(var birdInterface: BirdInterface): BirdInterface by birdInterface{
    override fun flyAndFindFood() {
        println("I am a Cuckoo. I am flying and finding food")
    }
}

fun main(args: Array<String>) {
    var eagle = Eagle(5)
    eagle.flyAndFindFood()
    var cuckoo = Cuckoo(eagle)
    cuckoo.flyAndFindFood()
}