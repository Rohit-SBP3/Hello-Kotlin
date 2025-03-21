
// Access Modifiers or Visibility Modifiers

fun main(){

    // by default every class is public.
    // (private, public, protected and internal)
    // protected is not applicable with top level declarations.

    // public class -> Everywhere
    // public class members -> Everywhere

    // internal class -> within module
    // internal class members -> within module

    // protected class -> n/a
    // protected class members -> within subclasses

    // private class -> within same file.
    // private class members -> within same class.
    val c = C()
    c.info()
}

abstract class Message{

    public var a = 10
    private var b  = 20
    protected var c = 30
    internal var d = 40

    abstract fun info()
}

class A: Message(){
    override fun info() = println("A is public")
    public fun secretInfo() = println("A is accessible to anyone! $a $c $d")
}

// internal is public within same module.
internal class B: Message(){
    override fun info() {
        println("B is internal")
    }
    internal fun secretInfo() = println("A is accessible to anyone!")
}

private class C: Message(){
    override fun info() {
        println("C is private")
    }
    private fun secretInfo() = println("A is accessible to anyone!")
}

open class D: Message(){
    override fun info() {
        println("I cant make D as protected!")
    }
    protected open fun secretInfo() = println("D is accessible to same class and children classes!")
}

class E: D(){
    override fun secretInfo() {
        super.secretInfo()
        println("E can access D")
    }
}



