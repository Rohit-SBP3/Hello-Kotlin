
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

    //Set
    val coins = setOf<Int>(1,2,5,10,20,5,2,1,10)
    println(coins)

    val rgb = mutableSetOf<String>("Red","Blue","Green")
    rgb.add("White")
    rgb.add("Red")
    rgb.add("Black")
    rgb.add("Green")
    println(rgb)

    println()
    println("Collection Functions")
    println()

    // Filtering (filter and filterNot)
    val evenNumbers = numbers.filterNot { it % 2 == 0 }
    println(evenNumbers)

    // Mapping (map)
    val names = listOf("Alice", "Bob", "Charlie")
    val nameLengths = names.map { it.length }
    println(nameLengths)


    // Sorting (sorted, sortedDescending)
    println(numbers.sorted())
    println(numbers.sortedDescending())

    // Checking Conditions (any, all, none)
    val ages = listOf(20, 25, 30, 35)
    println(ages.any { it > 30 })
    println(ages.all { it > 18 })
    println(ages.none { it < 18 })

    // Grouping (groupBy)
    val words = listOf("apple", "banana", "apricot")
    val grouped = words.groupBy { it.first() }
    println(grouped)

    // Reduce and Fold (reduce, fold)
    val sum = numbers.reduce { acc, num -> acc + num }
    println(sum)







}