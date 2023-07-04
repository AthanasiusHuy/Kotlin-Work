fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println(" Enter math mark ")
    var math = scanner.nextDouble()
    println(" Enter physics mark ")
    var phys = scanner.nextDouble()
    println(" Enter chemistry mark ")
    var chem = scanner.nextDouble()

    var avg = (math + phys + chem) / 3

    val grade = when {
        avg >= 8.0 -> "A"
        avg >= 6.5 -> "B"
        avg >= 5.0 -> "C"
        else -> "D"
    }
    println("Grade $grade")
}