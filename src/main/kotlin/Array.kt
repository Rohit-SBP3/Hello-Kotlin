fun main(){

    val vowels: Array<Char> = arrayOf('a','e','i','o','u')

    val num: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)

    val bigNum = arrayOf<Int>(102030,105739)

    for (c in vowels) println(c)

    for((i , e) in num.withIndex()) println("$i -> $e")

    for(i in bigNum) println(i)

    println(num[5])

    num.set(5,402)

    println(num.get(5))


}