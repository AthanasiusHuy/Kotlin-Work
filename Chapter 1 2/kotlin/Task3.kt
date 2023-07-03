fun divide(a: Int, b: Int) = a / b

fun check(a:Int,b: Int) {
    if (b != 0) {
        println(" Result ${divide(a,b)}")
    }else {
        println(" Denominator can't be 0")
    }
}

fun main(){
    val scanner = java.util.Scanner(System.`in`)
    println(" Enter numerator")
    val a = scanner.nextInt()
    println(" Enter denominator")
    val b = scanner.nextInt()
    check(a,b)

}