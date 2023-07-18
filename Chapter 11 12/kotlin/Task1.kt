fun main() {
    val map = HashMap<Int, String>()
    map[1] = "One"
    map[2] = "Two"
    map[3] = "Three"

    val list: List<Pair<Int, String>> = map.toList()

    for ((key, value) in list) {
        println("Key: $key, Value: $value")
    }
}