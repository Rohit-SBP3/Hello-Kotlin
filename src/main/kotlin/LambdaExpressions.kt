
fun main() {

    /***
     * Function to Lambda
     * fun sum(a: Int, b:Int): Int{
     *    return a+b
     * }
     *
     * val sum = {a: Int, b: Int -> a+b }
     * */

    val lambda = { x: Int, y: Int -> x+y }
    println(lambda(2,3))

    val sq: (Int) -> Int = { x: Int -> x * x }
    println(sq(2))

    val simpleSq: (Int) -> Int = { it * it }
    println(simpleSq(32))

    val sayHello: (String) -> Unit = {name -> println("Hello $name") }
    println(sayHello("Sneha"))

    // function type will be the last line data
    val multiLineLambda: () -> Int = {
        println("Hello World!")
        val s = 2 + 5
        "Hello Kotlin"
        3
        345
    }
    println(multiLineLambda.toString())

    val result = operate(4, 2) { x, y -> x * y }
    println(result)

    val s1 = operate(15,30) {x, y -> x+y}
    println(s1)
}
fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
