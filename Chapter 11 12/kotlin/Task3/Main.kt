package Task3


fun main() {
    val students = mutableListOf<Student>()

    var input: String
    do {
        val student = Student()

        print("Enter student code: ")
        student.studentCode = readLine() ?: ""

        print("Enter student name: ")
        student.studentName = readLine() ?: ""

        print("Enter student age: ")
        student.studentAge = readLine()?.toIntOrNull() ?: 0

        print("Enter student sex: ")
        student.studentSex = readLine() ?: ""

        students.add(student)

        print("Do you want to enter another student? (y/n): ")
        input = readLine()?.toLowerCase() ?: ""
    } while (input == "y")

    println("\nStudent Information:")
    students.forEach { student ->
        println("Code: ${student.studentCode}")
        println("Name: ${student.studentName}")
        println("Age: ${student.studentAge}")
        println("Sex: ${student.studentSex}")
        println()
    }
}
