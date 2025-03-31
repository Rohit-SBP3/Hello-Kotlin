
/*** Kotlin's  Collection Framework...
 *
 * Immutable Collections:-
 * List<T> - ordered collection with access to elements by indices
 * Set<T> - collection of unique elements
 * Map<K, V> - collection of key-value pairs
 *
 * Mutable Collections:-
 * MutableList<T> - mutable version of List
 * MutableSet<T> - mutable version of Set
 * MutableMap<K, V> - mutable version of Map
 *
 * */


fun main(){

    // List

    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    println("your lucky number is at Index: ${numbers.indexOf(3)}")
    println(numbers.contains(10))
    // By default Immutable
    // numbers[2] = 21

    val odd = mutableListOf<Int>(1,3,5,7,9)
    odd[3] = 11
    println(odd[3])

    val integerList = mutableListOf(1,23,3,5)
    integerList.addAll(odd)
    println(integerList)

    // Map

    val student = mapOf<Int, String>(1 to "Aman", 2 to "Anshu", 3 to "Bobby")
    println(student)

    val nameAndAge = mutableMapOf<String,Int>()
    nameAndAge["Suresh Raina"] = 32
    nameAndAge.put("MS Dhoni",43)

    nameAndAge["MS Dhoni"]
    nameAndAge.get("Suresh Raina")
    nameAndAge["Rohit Singh"]

    println(nameAndAge)

}