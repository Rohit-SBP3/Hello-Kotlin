fun main(){

    // * projection
    val il = printUnknownList(listOf(1,2,3,4,5))
    val cl = printUnknownList(listOf('A','B','C'))
    println("$il \t $cl")

    // Reified Type Parameters
    checkType<String>("Hello")  // It's of type class kotlin.String
    checkType<Int>("Hello")     // Not a class kotlin.Int

}

/***
 * Variance: in and out
 * Kotlin has in and out to specify how a generic type is used:
 * out T: Producer — You can only read T (used in return types).
 * in T: Consumer — You can only write T (used in parameter types).
 * */

class Producer<out T>(val value: T) {
    fun produce(): T = value
}

class Consumer<in T> {
    fun consume(item: T) {
        println("Consumed $item")
    }
}

// Star Projections *
fun printUnknownList(list: List<*>) {
    for (item in list) {
        println(item)
    }
}

// Reified Type Parameters (in inline functions)
// Normally, type information is erased at runtime due to type erasure, but with reified you can retain it:
inline fun <reified T> checkType(value: Any) {
    if (value is T) {
        println("It's of type ${T::class}")
    } else {
        println("Not a ${T::class}")
    }
}
