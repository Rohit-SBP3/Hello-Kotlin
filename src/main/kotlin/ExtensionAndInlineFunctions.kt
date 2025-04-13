
/***
 * Extension Function Notes:-
 *
 * In Kotlin, an extension function allows you to add new functions to existing classes without modifying their source code or using inheritance. It’s one of Kotlin’s most powerful and clean features for improving readability and organization.
 *
 * Extension functions don’t actually modify the class, they are resolved statically, meaning the function call is determined at compile-time.
 * You can’t override extension functions.
 * They are super useful in clean architecture, utility classes, and Android UI helpers.
 *
 * fun Context.toast(message: String) {
 *     Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
 * }
 * */

 /***
  * Inline Function Notes:-
  *
  * Kotlin's inline functions are used to improve performance by avoiding function call overhead, especially when passing lambda expressions.
  * What is an inline function?
  * An inline function inserts the function’s body directly at the call site during compilation.
  *
  * Why use it?
  * To reduce overhead from function calls.
  * To allow non-local returns from lambdas.
  * To pass cross-inline or no-inline lambdas.
  * */

fun main(){

    println("Hello Kotlin".formattedString())
    println("singh".capitaliseFirstLetter())

    val num: Int = 5
    println(num.square())

     // using inline When you compile this, it’s like the function’s body is copied into main()
     // this saves time on calling the function.

     // without using inline, Each lambda creates an object and a call, which adds runtime overhead.

     calculateTime {
         loop(3908338239)
     }

}

fun calculateTime(fn: () -> Unit) {

    val start: Long = System.currentTimeMillis()
    fn()
    val end: Long = System.currentTimeMillis()

    println( "The function takes ${end - start}ms time" )
}

fun loop(n: Long){
    for (i in 1 .. n){
        // TODO
    }
}

fun Int.square(): Int{
    return  this * this
}

fun String.formattedString(): String = "------------------\n$this\n------------------"


fun String.capitaliseFirstLetter(): String{
    return this.replaceFirstChar { it.uppercase() }
}

/***
 * noinline Keyword
 *
 * If you mark a function inline, all lambdas passed are inlined by default. But if you want to skip some:
 *
 * inline fun process(noinline onDone: () -> Unit, onStart: () -> Unit) {
 *     onStart()
 *     onDone()
 * }
 *
 * Here, only onStart is inlined. onDone is treated normally.
 * */


/***
 * Cross-inline Keyword
 *
 * If you want to prevent return from inside a lambda, use Cross-inline.
 *
 * inline fun runTask(crossinline task: () -> Unit) {
 *     val runnable = Runnable {
 *         task() // you can’t use `return` here from `task`
 *     }
 *     runnable.run()
 * }
 * */
