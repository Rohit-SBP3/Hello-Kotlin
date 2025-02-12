fun main(){

    var raining = false
    var haveUmbrella = false

    if(raining && haveUmbrella){
        println("You can go outside")
    }else if(!raining){
        println("You can go outside")
        raining = true
    }else if(raining && !haveUmbrella){
        kotlin.io.println("You can't go outside")
    }else if(!haveUmbrella) haveUmbrella = true

    val number = 10
    val result = if(number % 2 == 0){
        "Even"
    }else{
        "False"
    }

    // Kotlin do not have ternary operator!
    var calc = if(number == 10) "Yes" else "No"

    println(result)
    println(calc)
}