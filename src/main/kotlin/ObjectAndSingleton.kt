
// object keyword and object declaration.
// Class and its Single Object is created at once.
// No Constructors are allowed ( init block is allowed ).
// Singleton Pattern.
// You can inherit class/interface.

// Object Expression
// Anonymous Object using object keyword.
// Replacement of Java's Anonymous inner Class.

fun main(){

    // Directly use object without initialization.
    Apple.properties()
    Apple.clone()

    // Single Object -> Singleton Pattern
    SharingWidget.incXLikes(5)
    SharingWidget.incYtLikes(10)
    SharingWidget.incFbLikes(12)
    SharingWidget.display()

    // object expression
    val obj1 = object {
        private val objCount: Int = 10
        fun prop(){
            println("Object Count is $objCount")
        }
    }
    obj1.prop()

    val co = object: Cloneable{
        override fun clone() {
            println("co have clone method")
        }
    }
    co.clone()

    val name = object: FullName("Rohit", "Singh") {
        override fun getFullName(): String {
            println("Anonymous $name $surname")
            return super.getFullName()
        }
    }
    name.getFullName()

}

interface Cloneable{
    fun clone()
}

open class FullName(val name: String , val surname: String) {
    open fun getFullName(): String{
        return "$name $surname"
    }
}

object Apple: Cloneable{
    private const val size: Int = 10
    fun properties() = println("Apple have a radius of $size cm and is Juicy")

    override fun clone() {
        println("Clone Apples!")
    }
}

object SharingWidget{

    private var xLikes: Int  = 0
    private var ytLikes: Int  = 0
    private var fbLikes: Int  = 0

    fun incXLikes(likes: Int){
        xLikes += likes
    }
    fun incYtLikes(likes: Int){
        ytLikes += likes
    }
    fun incFbLikes(likes: Int){
        fbLikes += likes
    }

    fun display(){
        println("X Likes -> $xLikes  YT Likes -> $ytLikes  FB Likes -> $fbLikes")
    }

}

