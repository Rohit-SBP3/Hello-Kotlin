fun main() {

    // Using Factory Pattern
    val p1 = Pizza.Factory.create("Tomato")
    println(p1.toString())

    // Using companion object
    val p2 = Pizza.create("Peppy Paneer")
    println(p2.toString())

    // One more thing we can do - We want everyone to call this creates method if they want pizza
    // for that we will mark constructor as private
    //val p3 = Pizza("apple", "jdn")
    val p3 = Pizza.create("Not Known")
    println(p3.toString())

}


// Example of Factory Pattern using companion.
class Pizza private constructor(val type: String, val toppings: String){

    companion object Factory {
        fun create(pizzaType: String): Pizza {
            return when(pizzaType){
                "Tomato" -> Pizza("Tomato","Tomato, Cheese, Olive oil")
                "Peppy Paneer" -> Pizza("Peppy Paneer", "Paneer, Pepper, Onions")
                else -> Pizza("Classic", "Onion, Olives, Mushroom, Sweet Corn")
            }
        }
    }

    override fun toString(): String {
        return "Pizza(type='$type', toppings='$toppings')"
    }


}