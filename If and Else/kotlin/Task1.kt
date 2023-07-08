fun main() {
    var scanner = java.util.Scanner(System.`in`)
    print("Enter length: ")
    var a = scanner.nextInt()
    print("Enter width: ")
    var b = scanner.nextInt()
    if (a == b) {
        println("Its a square")
    } else {
        println("Its a rectangle")
    }
}