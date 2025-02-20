
// Function Overloading
fun main(){

    println(addition(10,20))

    println(addition(20,4048479284029))


    println(addition(6048479000000,4048479284029))


    // Named Argument
    println(addition(a = 105,b = 130,c = 304))

}

private fun addition(a: Int, b: Int) =  a + b

private  fun addition(a: Int, b: Long) =  a + b

private  fun addition(a: Long, b: Long) = a + b

private fun addition(a: Int, b: Int, c: Int) = a + b + c