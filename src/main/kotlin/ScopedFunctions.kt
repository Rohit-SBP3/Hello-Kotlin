
/***
 * Kotlin has five main scoped functions:-
 *
 * Function  - Context Object - Return Value   - Use Case
 * let       - it	          - Lambda result  - Null checks, chaining
 * run	     - this	          - Lambda result  - Object configuration + result
 * with	     - this	          - Lambda result  - Object configuration (non-extension)
 * apply	 - this	          - The object     - Builder pattern, init blocks
 * also	     - it	          - The object	   - Side effects like logging
 * */

/* let :-
Uses it
Returns the last expression
Great for null safety and chaining
*/

/* run :-
Uses this
Returns the lambda result
Good for executing code blocks on an object
*/

/* with :-
Uses this
Returns the lambda result
NOT an extension function
*/

/* apply :-
Uses this
Returns the object itself
Common in initializing objects
*/

/* also :-
Uses it
Returns the object itself
Useful for side effects, like logging or debugging
*/

fun main(){

    var n: String? = null
    // println(name?.length) if null then print null...

    // If null then won't execute anything....
    n?.let {
        println("Length: ${it.length}")
    }

    val length = "Kotlin".run {
        println("Uppercase: ${this.uppercase()}")
        println( length )
    }
    println(length)

    val result = with(StringBuilder()) {
        append("Hello, ")
        append("Rohit!")
        toString()
    }
    println(result)

    val user = Uuser().apply {
        name = "Rohit"
        age = 23
    }
    println(user.toString())

    val numbers = mutableListOf(1, 2, 3)
        .also { println("Before adding: $it") }
        .apply { add(4) }
        .also { println("After adding: $it") }
    println(numbers)

}

class Uuser(
    var name: String = "",
    var age: Int = 0


) {
    override fun toString(): String {
        return "Uuser(name='$name', age=$age)"
    }
}

