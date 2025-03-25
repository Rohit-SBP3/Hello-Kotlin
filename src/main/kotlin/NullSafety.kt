
// ? means null can also be assigned...
// ?. safe call...
// ?: if null then assign value...
// !! if null throws error...

fun main(){

    val name: String? = null

    // null check
    if(name != null) println(name.lowercase())

    // Safe call operator (?.)
    println(name?.uppercase())

    // For executing many statements with null checking...
    // let can be used with both nullable and non-nullables...
    name?.let {
        println("Are you $name?")
        println("Hello $it")
    }

    val g1 = Gender("Male")
    g1.printGenderInfo()

    val g2 = Gender(null)
    g2.changeNullGender("Female")

    val g3 = Gender("Female")
    g3.changeGender("Male")

}

class Gender(private var gender: String?){

    fun printGenderInfo(){
        when(gender){
            "Male" -> println("You are a Male")
            "Female" -> println("You are a Female")
            "Others" -> println("You belong to Others")
            null -> println("Can't say anything")
        }
    }

    fun changeNullGender(newGender: String){
        // Elvis Operator / Null-Coalescing Operator
        gender = gender ?: newGender

        // not null asserted operator...
        gender!!
        println("null is changed to $gender")
    }

    fun changeGender(newGender: String){
        gender = newGender
        println("New gender is $gender")
    }
}