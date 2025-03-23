
// A sealed class in Kotlin is used to represent a restricted hierarchy of classes,
// meaning it allows a fixed set of subclasses.
// It is similar to an enum class but more powerful since each subclass can hold different
// types of data.

// Unlike enum, each subclass can have different data types.
// Ensures type safety.
// Allows exhaustive when expressions without an else.
// More flexible than enum because each subclass can hold different properties.

fun main() {

    val t1 = DistinctTiles.Red("Fire", 32)
    println(t1)

    val t2: Tiles = Tiles.Grey(34)
    println(t2)

    val t3 = DistinctTiles.Green
    println(t3)

    val points = when(t2){
        is Tiles.Grey -> t2.score * 2
        is Tiles.Black -> t2.score * 4
        is Tiles.Purple -> t2.score * 6
    }
    println(points)



}

sealed class DistinctTiles {
    data class Red(val type: String, val score: Int): DistinctTiles()
    class Blue(val score: Int) : DistinctTiles()
    object Green: DistinctTiles()
}

sealed class Tiles {
    class Grey(val score: Int) : Tiles()
    class Black(val score: Int): Tiles()
    class Purple(val score: Int): Tiles()
}
