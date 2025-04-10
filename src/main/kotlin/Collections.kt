
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
    println("Collection Functions ")
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

    // Diff usage of filter.....
    //val tf = numbers.filter(::isOdd)
    /*val tf = numbers.filter ( fun(n: Int): Boolean{
        return n % 2 == 0
    } )*/
    val tf = numbers.filter { a: Int -> a % 2 == 0 }
    println("These are odd numbers $tf")

    // Map practice
    val squares = numbers.map { it * it }
    println(squares)

    val userList = listOf<User>(
        User(1,1000,"Roman"),
        User(2,2000,"Rocky"),
        User(3,900,"Raman"),
        User(4,1240,"Ricky"),
        User(5,1530,"Ryan")
    )

    val paidUser = userList.map {
        if(it.bill > 1000) PaidUser(it.id,it.bill,it.name,"Premium")
        else PaidUser(it.id,it.bill,it.name,"Standard")
    }

    println(paidUser)

    numbers.forEach { println( it % 2 != 0 ) }




}

data class User(val id:Int, val bill: Int, val name: String)

data class PaidUser(val id: Int, val bill: Int, val name: String, val type: String)

fun isOdd(n: Int): Boolean{
    return n % 2 != 0
}