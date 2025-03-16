
// Abstract Classes and dInterface...
// Type Checking and Smart Casting... (is and as)

fun main(){

    // In simple words abstract means Incomplete...
    playGames( arrayOf(Cricket(), Football()) )
    val p1 = Player("MSD")
    println(p1.play())

    // Type checking
    if(p1 is Player) println("p1 is player")

    playGames( arrayOf( Cricket(), Football(), Cricket(), Cricket()))


}

fun playGames(games: Array<Game>){
   for (g in games){
       if(g is Football) println(g.play())
       else {
           (g as Play).play()
       }
   }
}

// Abstract class can have abstract and non-abstract properties and methods...
// When you add abstract there is no need to add open
// bcz abstracts are meant to be defined by the children.
// You can't make instance of abstract classes...
abstract class Game: Play{
    // When you do not know about the methods and property of your method then
    // you define it abstract so that the child classes would re-define it.
    // ## Abstract methods and properties should be defined in the abstract classes.

    // abstract fun play(): String
    abstract val score: Int
    val balls: Int = 60
    abstract fun notPlay(): String
}

class Cricket: Game() {

    override val score: Int = 120

    override fun play(): String {
        return "playing Cricket!, need $score runs in $balls balls"
    }

    override fun rest(): String {
        return "Needs 1 over rest!"
    }

    // It becomes necessary for Child classes to override
    // all the abstract methods in the parent...
    override fun notPlay(): String {
        return "IDK"
    }

    override val time: Int
        get() = 4
}

class Football: Game() {

    override val score: Int
        get(){ return 3 }

    override fun play(): String {
       return "playing Football!, need $score goals"
    }

    override fun rest(): String {
        return "Need 10 min rest"
    }

    override fun notPlay(): String {
        return "not playing Football!"
    }

    override val time: Int
        get() = 3

}

class Player(private val name: String): Play {
    override val time: Int
        get() = 1

    override fun play(): String {
        return "$name is playing!"
    }

    override fun rest(): String {
        return "$name needs rest!"
    }
}

// When you have don't have inheritance among classes, but they have some common behaviour
// then you use Interface to group this behaviour...
// Classes which do not belong to same Inheritance hierarchy...
// Whoever implements has to provide the body to the property or method...
// It can have both abstract and concrete methods...
// Classes can have many interfaces but only one superclass.
// Interface can implement other interfaces.
interface Play: Rest{
    val time: Int
    fun play(): String
}

interface Rest{
    fun rest(): String
}