fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Enter n terms: ")
    var n = scanner.nextInt()
    for (i in 1..n) {
        var cube = i * i * i
        println("Number is : $i and cube of $i is : $cube ")
    }

}