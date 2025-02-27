fun main(){

    val n = 5
    println(n in 1..5) // UpperBound is Included
    println(n in 1 until 5) // UpperBound is not Included

    val animal = "Dog"
    if(animal == "Cat") println("Animal is Cat")
    else if(animal == "Lion") println("Animal is Lion")
    else if(animal == "Dog") println("Animal is Dog")
    else println("Animal is Dead!!!!")

    var ani = "Whale"

    when(ani){
        "Horse" ->  println("Animal is Horse")
        "Dog" ->  println("Animal is Dog")
        "Cat" ->  println("Animal is Cat")
        else -> println("Animal is Dead")
    }

    ani = when(ani){
        "Horse" ->  "Animal is Horse"
        "Dog" ->  "Animal is Dog"
        "Cat" ->  "Animal is Cat"
        "Whale" -> "Its a Whale"
        else -> "Animal is Dead"
    }

    val num = 13
    val res = when(num){
        12 -> "Twelve"
        in 13..19 -> "teen"
        else -> "I don't Know"
    }
    println(res)
    print(ani)
}