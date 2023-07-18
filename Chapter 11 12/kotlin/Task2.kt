fun main() {
    var capitals = hashMapOf<String, String>()
    capitals.put("Nepal", "Kathmandu")
    capitals.put("India", "New Delhi")
    capitals.put("United States", "Washington")
    capitals.put("England", "London")
    capitals.put("Australia", "Canberra")

    val sortedCapitals = capitals.toList()
        .sortedBy { (_, value) -> value }
        .toMap()

    sortedCapitals.forEach { (country, capital) ->
        println("Country: $country, Capital: $capital")
    }
}