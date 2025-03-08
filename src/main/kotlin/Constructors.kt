/*
* Constructors in Kotlin:-
*
* Class has two things Properties and Methods.
* Initialize the object and provide default value to Properties.
*
* In Kotlin, a constructor is a special function used to initialize objects. There are two types of constructors in Kotlin:
* Primary Constructor
* Secondary Constructor
* */

fun main(){
    val s1 = Student("Rohit Singh", 23,97.4)

    val t1 = Teacher("Singham", 34,7,56000)

    val e1 = Employee()

    val b1 = Bike("Tesla", "Model 3", 50000)
    println("${b1.brand} ${b1.model} costs ${b1.price}")

    val a1 = Automobile(enginePower =  100, rating = 1)
    println("${a1.type}  ${a1.hasAirBag}  ${a1.nOfTyres}  ${a1.enginePower}  ${a1.rating}")

}

// The primary constructor is defined in the class header
class Student(val name: String, val age: Int, val marks: Double) {

    // The init block is used to initialize values or execute some logic when the object is created.
    init {
        println("Student name is $name, age is $age and marks are $marks")
    }
}

// The secondary Constructor
class Teacher{

    private var name: String
    private var age: Int
    private var yoe: Int
    private var salary: Int

    // The constructor keyword is used to define the secondary constructor.
    constructor(name: String, age: Int, yoe: Int, salary: Int) {
        //  This keyword is used to refer to the current instance variables.
        this.name = name
        this.age = age
        this.yoe = yoe
        this.salary = salary
        println("Teacher's name is $name, age is $age, years of experience is $yoe and salary is $salary")
    }

}

// Constructor with default value
class Employee(val name: String = "Unknown", val salary: Int = 30000)

// A secondary constructor can call the primary constructor using this.
class Bike(val brand: String, val model: String) {

    var price: Int = 0

    // Secondary constructor calling the primary constructor
    constructor(brand: String, model: String, price: Int) : this(brand, model) {
        this.price = price
    }
}

class Automobile(val type: String, val hasAirBag: Boolean, val nOfTyres: Int){

    var enginePower: Int = 0
    var rating: Int = 0

    constructor(enginePower: Int, rating: Int): this("Bike", false, 2)

}
