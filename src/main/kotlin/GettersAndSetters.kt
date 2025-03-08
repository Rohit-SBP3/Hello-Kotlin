fun main(){

    val c1 = Calculator()
    println( c1.addition(12,47))

    if(c1.checkInitialization()) println(c1.message)
    else println("Message is not Initialized!")
}

class Calculator {

    // Allowed for var properties only (Not val).
    // Cannot be used with primitive types (Int, Double, etc.).
    // Must be initialized before use, or it will throw an exception.
    // Useful in dependency injection, Android views, and unit testing.
    lateinit var message: String

    fun checkInitialization(): Boolean {
        return this::message.isInitialized
    }

    fun addition(a: Int, b: Int): Int {
        return a + b
    }

    fun subtraction(a: Int, b: Int): Int {
        return if (a > b) a - b else b - a
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        return if(b == 0) 0 else a / b
    }
}