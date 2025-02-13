// While and Do-While.

fun main(){

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

    //Do While.................................
    var i = 10
    val j = 20
    do{
        println("Sum of $i and $j is: " + (i+j))
    }while(i-- > 0)
}