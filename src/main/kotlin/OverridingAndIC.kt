fun main(){

    // Overriding
    // Calling Parameterized classes in Inheritance context!!
    // Calling Parent method using super keyword
    // Every Kotlin class has (Any) as a Super class.

    val d1 = Dog("Tiger")
    d1.eat("omnivores")
    d1.run()
    d1.animalInfo()

    println( d1.toString() )

    println()

    val a1 = Animal("Roger")
    a1.eat("Carnivores")
    a1.run()
    a1.animalInfo()

    // Mentioned in Any class
    println( a1.toString() )

}

open class Animal(val animalName: String){

    open val legs: Int = 4
    open val size: String = "s"
    open val modeOfNutrition: String = "herbivores"
    open val speed: Double = 45.0

    open fun eat(mode: String){
        if(mode == modeOfNutrition) println("$animalName eat Grass and trees")
        else println("$animalName eat any Animal!")
    }

    open fun run() = println("$animalName is running at a speed of $speed km/h")

    fun animalInfo() = println("$animalName have $legs legs is $size in size eats $modeOfNutrition food and runs at $speed km/h")

}

class Dog(typeParam: String): Animal(typeParam){

    override val modeOfNutrition: String = "omnivores"

    override fun run(){
        super.run()
        println("MF Dog is running unnecessarily")
    }

    override fun eat(mode: String) {
        if(mode == modeOfNutrition) println("$animalName is Eating Dog Food")
    }

    override fun toString(): String {
        return animalInfo().toString()
    }

}