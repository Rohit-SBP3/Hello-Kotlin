import java.util.*

fun main(){

    val a1 = Aadmi("Marshal", -22)
    println( a1.name )
    a1.name = "Marsh"
    a1.age = -2

}

class Aadmi(nameParam: String, ageParam: Int){

    var name: String = nameParam
        set(value) {
            if(value.length < 6) println("Length should be greater than 6") else field = value
        }
        get() {
            return field.uppercase(Locale.getDefault())
        }

    var age = ageParam
        set(value) {
            if(value > 0) field = value else println("Negative value can't be assigned")
        }

    // By Default Kotlin does this
    var email: String = ""
        get() = field
        set(value) { field = value }

}