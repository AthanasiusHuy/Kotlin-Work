fun main() {
    var scanner = java.util.Scanner(System.`in`)
    print("Enter quantity: ")
    var a = scanner.nextInt()
    var price = a * 100
    if (price > 1000) {
        price -= (price * 10) / 100
        println("Price $price")
    } else
        println("Price $price")
}