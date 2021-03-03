package enum

enum class CompassDirection {
    EAST,
    WEST,
    SOUTH,
    NORTH
}

enum class Color(var red: Int, var green: Int, var blue: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);
}

enum class ActionState {
    ACTIVE {
        override fun reverseAction() = INACTIVE
    },
    INACTIVE {
        override fun reverseAction() = ACTIVE
    };
    abstract fun reverseAction(): ActionState
}

fun main(args: Array<String>) {
    println("East enum = ${CompassDirection.EAST}")
    println(Color.RED.toString())
    println(Color.BLUE.blue)
    println("Color name: ${Color.GREEN.name}, ordinal: ${Color.GREEN.ordinal}")
    println(Color.valueOf("BLUE"))
//    println(Color.valueOf("BLUE123"))
    for (color in Color.values()) {
        println("Color values is $color")
    }

    println(ActionState.ACTIVE.reverseAction())
    println(ActionState.INACTIVE.reverseAction())
}