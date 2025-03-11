fun main(){

    val a1 = Aadmi("Marshal", 22)
    a1.name = "marsh"
    a1.age = -10

}

class Aadmi(nameParam: String, ageParam: Int){

    var name: String = nameParam
        set(value) {
            if(value.length < 6) println("Empty") else field = value
        }
    var age = ageParam
        set(value) {
            if(value > 0) field = value else println("Negative value can't be assigned")
        }

}