fun main(){

}

/***
 * Variance: in and out
 * Kotlin has in and out to specify how a generic type is used:
 * out T: Producer — You can only read T (used in return types).
 * in T: Consumer — You can only write T (used in parameter types).
 * */

class Producer<out T>(val value: T) {
    fun produce(): T = value
}

open class Animals {
    fun sound() = println("Animal sound")
}

class Dogs : Animals() {
    fun bark() = println("Bark!")
}

fun printAnimal(producer: Producer<Animals>) {
    val animal = producer.produce()
    animal.sound()
}