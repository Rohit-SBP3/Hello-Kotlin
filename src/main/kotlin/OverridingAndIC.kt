fun main(){

    val d1 = Dog()
    d1.eat("omnivores")

}

open class Animal{

    open val legs: Int = 4
    open val size: String = "s"
    open val modeOfNutrition: String = "herbivores"
    open val speed: Double = 45.0

    open fun eat(mode: String){
        if(mode == modeOfNutrition) println("Eat Grass and trees")
        else println("Eat any Animals!")
    }

    open fun run() = println("Animal is running at a speed of $speed km/h")

    fun animalInfo() = println("$legs $size $modeOfNutrition $speed")

}

class Dog: Animal(){

    override val modeOfNutrition: String = "omnivores"

    override fun run() = println("MF Dog is running unnecessarily")

    override fun eat(mode: String) {
        if(mode == modeOfNutrition) println("Dog is Eating Dog Food")
    }

}