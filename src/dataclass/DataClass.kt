package dataclass

fun main(args: Array<String>) {
    var user = User("Nguyen Dinh Sang", 22)
    println(user.toString())
    var backupUser = user
    println("Backup: ${backupUser.toString()}")

    user.age = 18
    println("After edit")
    println(user.toString())
    println("Backup: ${backupUser.toString()}")
    println(user.hashCode())
    println(backupUser.hashCode())

    if (user.hashCode() == backupUser.hashCode()) {
        println("2 object have the same content")
    } else {
        println("2 object have NOT the same content")
    }

    //copy
    var backupUser2 = user.copy()
    println("Backup: ${backupUser2.toString()}")

    user.age = 22
    println("After edit2")
    println(user.toString())
    println("Backup: ${backupUser2.toString()}")
    println(user.hashCode())
    println(backupUser2.hashCode())

    if (user.equals(backupUser2)) {
        println("2 object have the same content")
    } else {
        println("2 object have NOT the same content")
    }
}