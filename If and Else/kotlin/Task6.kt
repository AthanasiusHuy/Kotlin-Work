fun main() {
    var scanner = java.util.Scanner(System.`in`)
    print("Enter first person age: ")
    var a = scanner.nextInt()
    print("Enter second person age: ")
    var b = scanner.nextInt()
    print("Enter third person age: ")
    var c = scanner.nextInt()
    val oldest = when {
        a >= b && a >= c -> "first"
        b >= a && b >= c -> "second"
        else -> "third"
    }

    val youngest = when {
        a <= b && a <= c -> "first"
        b <= a && b <= c -> "second"
        else -> "third"
    }

    println("Oldest Person: $oldest")
    println("Youngest Person: $youngest")

}