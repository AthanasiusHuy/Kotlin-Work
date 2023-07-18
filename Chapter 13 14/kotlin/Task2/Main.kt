package Task2

fun main(){
    val student = Student("John","190 St","Math",2023,90.0)
    val teacher = Teacher("Mol","10 Rd","HINP",3000.0)

    println(student.getRating())
    println(teacher.upToSalary(10))
}