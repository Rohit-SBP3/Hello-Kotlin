fun main(){
    println(add(10,20))
    println(isEven(13))
    isEvenOrOdd(21)
}

// Return type Int
fun add(a: Int, b: Int): Int {
    return a+b
}

//Return type Unit
fun isEvenOrOdd(a: Int):Unit{
    if(a % 2 == 0) print("Even")
    else print("Odd")
}

// Return type Boolean
fun isEven(b: Int):Boolean{
    return b % 2 == 0
}