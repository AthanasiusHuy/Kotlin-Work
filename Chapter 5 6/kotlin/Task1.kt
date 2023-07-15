fun main() {
    var a = 5
    var b = 10

    println("Before swap:")
    println("a = $a")
    println("b = $b")

    val c = a
    a = b
    b = c

    println("After swap:")
    println("a = $a")
    println("b = $b")
}
