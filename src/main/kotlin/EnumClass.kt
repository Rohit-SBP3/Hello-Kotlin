
// Enum Class.

fun main(){

    val m = Days.Monday
    println(m)

    val t = DaysFromNumber.Friday
    println(t.number)
    println(t.printEvenAndOddDays())

    println("-------------------------")


    for(day in Days.values()) {
        println(day)
    }

    for(d in DaysFromNumber.values()){
        println(d.number)
    }


}

// Enums in Kotlin (enum class) are used to define a set of constant values.
// They are useful for representing a fixed number of related values,
// like days of the week, user roles, or states.
enum class Days {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

enum class DaysFromNumber(val number: Int){
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),
    Saturday(7);

    fun printEvenAndOddDays(): String {
        return if(number % 2 == 0) "$this is even day" else "$name is odd day"
    }
}

