fun main() {
    CompanionObjectClass.FObject.printObject()
    CompanionObjectClass.printObject()
    println( CompanionObjectClass.times )
    CompanionObjectClass.GObject.printObject()
}

// One companion object inside a class.
// You can directly access its methods and properties.
// Java's static and Kotlin's companion are diff things.

class CompanionObjectClass{

    companion object FObject {

        const val times: Int = 10

        // Now it will behave as static method in java code.
        @JvmStatic
        fun printObject(){
            println("You are Inside F Object")
        }
    }

    object GObject {
        fun printObject(){
            println("You are Inside G Object")
        }
    }

}