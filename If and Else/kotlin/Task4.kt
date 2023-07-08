fun main() {
    var scanner = java.util.Scanner(System.`in`)
    print("Enter years of service: ")
    var year = scanner.nextDouble()
    print("Enter salary: ")
    var salary = scanner.nextDouble()
    if (year > 5) {
        var bonus = (salary * 5) / 100
        println("Bonus $bonus")
    } else
        println("No bonus")
}