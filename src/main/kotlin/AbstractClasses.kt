fun main(){

    // In simple words abstract means Incomplete...

    val g1: Game = Cricket()
    println( g1.play() )

}

// Abstract class can have abstract and non-abstract properties and methods...
// When you add abstract there is no need to add open
// bcz abstracts are meant to be defined by the children.
// You can't make instance of abstract classes...
abstract class Game(){
    // When you do not know about the methods and property of your method then
    // you define it abstract so that the child classes would re-define it.
    // ## Abstract methods and properties should be defined in the abstract classes.

    abstract val score: Int
    val balls: Int = 60
    abstract fun play(): String
    abstract fun notPlay(): String
}

class Cricket(): Game(){

    override val score: Int = 120

    override fun play(): String {
        return "Playing Cricket! need $score runs in $balls balls"
    }

    // It becomes necessary for Child classes to override
    // all the abstract methods in the parent...
    override fun notPlay(): String {
        return "IDK"
    }
}