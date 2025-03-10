fun main(){

    val a1 = Aadmi("Marsh", 22)
    a1.age = -10

}

class Aadmi(nameParam: String, ageParam: Int){

    var name: String = nameParam
    var age = ageParam
        set(value) {
            if(value > 0) field = value else kotlin.io.println()
            field = value
        }

}