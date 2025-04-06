import kotlin.math.pow
fun main(){

    // Defining types of param and return >>>>>
    val s: (a: Int, b: Int) -> Int = :: sum
    println(s(2,56))

    // Automatically done by compiler
    val pow = ::power
    println( pow(10.0, 4.0) )

    /***
     * Higher order functions:-
     * In Kotlin, higher-order functions are functions that either:
     * Take other functions as parameters,
     * Return a function, or both.
     *  */

    println(calc(12.0,10.3,::power))

}

fun calc(a: Double, b: Double, gn: (Double, Double) -> Double): Double{
    return gn(a,b)
}

fun sum(a:Int, b:Int):Int{
    return a+b
}

fun power(a:Double, b:Double): Double{
    return a.pow(b)
}