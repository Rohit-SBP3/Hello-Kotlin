// While and Do-While.

fun main() {

    // While and Do-While....................................................

    var num = 10
    var ind = 1
    while(num-- > 0){
        println(num)
    }

    val table = 10
    while(ind <= table){
        println("Table of $table: " + (ind*table))
        ind++
    }
    print("Index outside $ind")


    // Do While.............................................................

    var i = 10
    val j = 20
    do{
        println("Sum of $i and $j is: " + (i+j))
    }while(i-- > 0)


    // For Loop, Ranges and String Templating...............................

    // Include UpperBound
    for(a in 1..10) print("$a ")

    println()

    // Exclude UpperBound
    for(a in 1 until 10) print("$a ")

    println()

    for(a in 10 downTo 1) print("$a ")

    println()

    table(23)

    table(45)

}

fun table(num: Int){
    for(i in 1..10){
        val pro = num * i
        println("$num * $i = $pro")
    }

    for(i in 1..10){
        println(num.toString() + " x " + i + " = " + (num * i))
    }
}