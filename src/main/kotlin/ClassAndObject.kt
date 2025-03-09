fun main(){

    val mustang = Car("Ford","Petrol",1090)

    println(mustang.name)
    println( mustang.type)
    println(mustang.kmRan)
    mustang.driveCar(10)
    mustang.applyBrake()

    val i: Int  = 203
    println(i.plus(904))
    println(i.toFloat())
    println(i.times(43))

    val p1 = Person("Rohit Singh", 23)
    println( p1.canVote())
    p1.personDetail()
}

private class Person(val name: String, var age: Int){

    fun canVote(): Boolean{
        return age > 18
    }

    fun personDetail(){
        println("Person name is $name and age is $age")
    }

}

