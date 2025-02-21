import kotlin.math.pow

// Function Overloading
fun main(){

    println(addition(10,20))

    println(addition(6048479000000,4048479284029))

    // Named Argument
    println(addition(a = 105,b = 130,c = 304))


    // Storing Function in variable
    val fn1 = :: subtract
    // Explicitly Defining
    val fn2 : (a: Int,b: Long) -> Long = ::addition
    println(fn1(21,1) + fn2(20,4048479284029))

    val fn3 : (a: Double, b: Int) -> Double = ::power
    println(fn3(10.0,2))

}

private fun power(a: Double, b: Int) = a.pow(b)

private fun subtract(a: Int, b: Int) = a - b

private fun addition(a: Int, b: Int) =  a + b

private  fun addition(a: Int, b: Long) =  a + b

private  fun addition(a: Long, b: Long) = a + b

private fun addition(a: Int, b: Int, c: Int) = a + b + c