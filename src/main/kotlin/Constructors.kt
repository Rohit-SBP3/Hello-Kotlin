/*
* Constructors in Kotlin:-
*
* Class has two things Properties and Methods.
* Initialize the object and provide default value to Properties.
*
* */

fun main(){
    val bulletClassic350  = AutoMobile("MotorBike",2,120,2)
    bulletClassic350.accelerate()
    bulletClassic350.decelerate()
}

class AutoMobile(val type: String, val maxSeating: Int, val horsePower: Int, val noOfTyres: Int){

    fun accelerate(){
        println("$type is Accelerating!")
    }

    fun decelerate(){
        println("$type is Decelerating!")
    }

}