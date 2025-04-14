
// Generic Functions and vararg....

/***
 * Kotlin generics allow you to write flexible and reusable functions, classes, and interfaces that can work with any type.
 *
 * fun <T> printItem(item: T) {
 *     println(item)
 * }
 *
 * Here:
 * T is a generic type parameter.
 * You can now pass any type of value to printItem():
 * */

fun main(){

    // Single Type Parameter....
    val intBox = Box(10)
    val stringBox = Box("Kotlin")
    println(intBox.getItem())
    println(stringBox.getItem())

    // Multiple Type Parameters....
    val pair = Pair("Rohit", 25)
    println(pair.first)
    println(pair.second)

    // Generic Constraints (<T : SomeType>)
    val sum = sum(3,5.9)
    println(sum)

    // Generic Functions
    printList(listOf("A", "B", "C"))
    printList(listOf(1, 2, 3))

    // vararg
    println(countInt(1,2,3,4,5,6,7,8,9,10))
}

fun countInt(vararg value: Int): Int{
    var sum: Int = 0
    for(i in value)
        sum += i
    return sum
}

// Generic Functions
fun <T> printList(items: List<T>) {
    for (item in items) {
        println(item)
    }
}

// Only Number types (like Int, Float, Double) can be passed in.
fun <T : Number> sum(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

class Pair<A, B>(val first: A, val second: B)

class Box<T>(private val item: T) {
    fun getItem(): T {
        return item
    }
}