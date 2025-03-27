import java.lang.IllegalArgumentException

/***
 * Exception Handling
 * try
 * catch
 * finally
 * */

fun main(){


    // You have to use either of them with the try block (catch,finally )...
    val nums = arrayOf(0,1,2,3,4,5,6,7,8,9,10,11)

    try {
        nums[14]
    }catch (e: Exception){
        println(e.message)
    }finally {
        println("This MF will get printed anyway")
    }

    for(num in nums){
        if(checkNumber(num)){
            println("In the Range")
        }else throw IllegalArgumentException("Not In Range")
    }

    // Multiple catch can be used with the try statement...
    try{
        100 / 0
    }catch (e: ArithmeticException){
        println(e.message)
    }catch (e: Exception){
        println(e.message)
    }

    try {
        nums[10] / nums[14]
    }finally {
        println("No Answer")
    }

    println("This will not print bcz of no catch")
}

fun checkNumber(num: Int): Boolean{
    return num in 0..9
}