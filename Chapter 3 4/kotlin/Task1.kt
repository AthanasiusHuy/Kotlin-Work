fun main(){
    val scanner = java.util.Scanner(System.`in`)
    println(" Enter first number ")
    var a = scanner.nextInt()
    println(" Enter second number ")
    var b = scanner.nextInt()
    println(" Before $a , $b")

    a = a xor b
    b = a xor b
    a = a xor b

    println(" After $a , $b")
}