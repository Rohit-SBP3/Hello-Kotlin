fun main(){

    // We make reference of type parent but make the object of type Child...
    // Parent can hold a reference to its child.
    // Parent can call methods of child classes (which are common).
    // Sabka Baap h Any...

    val s0: Shape = Shape()
    println( s0.area() )

    val s1: Shape = Circle(4.5)
    println(s1.area())

    val s2: Shape = Square(3.5)
    println(s2.area())

    val shapes: Array<Shape> = arrayOf( Circle(2.1), Square(2.3), Triangle(2.3,4.8))
    calculateAreas(shapes = shapes)

}

fun calculateAreas(shapes: Array<Shape>){
    for( shape in shapes){
        println(shape.area())
    }
}

open class Shape: Any(){
    open fun area(): Double {
        return 0.0
    }
}

class Circle(private val radius: Double): Shape(){

    private val area = Math.PI * radius * radius
    override fun area(): Double {
        return super.area() + area
    }
}

class Triangle(private val base: Double, private val height: Double): Shape() {

    private val area = 0.5 * base * height

    override fun area(): Double {
        return super.area() + area
    }

}

class Square(private val side: Double): Shape(){

    private val area = side * side

    override fun area(): Double {
        return super.area() + area
    }
}

