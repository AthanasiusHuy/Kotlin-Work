package Task2

class Teacher(name: String, address: String, private var school: String, private var salary: Double) :
    Person(name, address) {

    fun getSchool(): String {
        return school
    }

    fun setSchool(school: String) {
        this.school = school
    }

    fun getSalary(): Double {
        return salary
    }

    fun setSalary(salary: Double) {
        this.salary = salary
    }

    fun upToSalary(percent: Int) : Double {
        salary += (salary * percent) / 100
        return salary
    }
}