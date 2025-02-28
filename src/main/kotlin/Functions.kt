fun main(){
    println(add(10,20))
    println(isEven(13))
    isEvenOrOdd(21)
    println(addThree(12,32,34))
    sayHelloToNum(5)

    println(fact(6))

    println("The char is Vowel? -> " + isVowel('s'))

    // The value we define in function is known as parameter,
    // The value we pass is known as argument.

    //Note: var on function parameter is not allowed.
}

// Return type Int
fun add( a: Int, b: Int): Int {
    return a+b
}

//Return type Unit
fun isEvenOrOdd(a: Int) {
    if(a % 2 == 0) println("Even")
    else println("Odd")
}

// Return type Boolean
fun isEven(b: Int):Boolean{
    return b % 2 == 0
}

// Inline Function( if return type is same no need to mention
fun addThree(a: Int, b: Int, c: Int) = a + b + c

// Default value to Pram
fun sayHelloToNum(num: Int = 10){
    for (i in 1..num) println("Hello $i")
}

fun fact(num: Int): Int {
    return if(num == 1)  num
    else num * fact(num-1)
}

fun isVowel(c: Char): Boolean{
    return c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c == 'u'
}