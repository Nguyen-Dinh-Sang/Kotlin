package interfaces

class Bat() : IAnimal {
    override fun walk() {
        super.walk()
        println("walk")
    }

    override fun eat() {
        println("eat")
    }

}