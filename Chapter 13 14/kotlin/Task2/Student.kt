package Task2

class Student(
    name: String,
    address: String,
    private var program: String,
    private var year: Int,
    private var score: Double
) :
    Person(name, address) {

    fun getProgram(): String {
        return program
    }

    fun setProgram(program: String) {
        this.program = program
    }

    fun getYear(): Int {
        return year
    }

    fun setYear(year: Int) {
        this.year = year
    }

    fun getScore(): Double {
        return score
    }

    fun setScore(score: Double) {
        this.score = score
    }

    fun getRating(): String {
        return when {
            score < 5 -> "Bad"
            score < 8 -> "Medium"
            else -> "Good"
        }
    }
}