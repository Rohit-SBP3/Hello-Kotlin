class Car(
    // Properties of a class
    val name: String,
    val type: String,
    var kmRan: Int,
){

    // methods of a class

    fun driveCar(km: Int){
        kmRan += km
        println("Car has been driven $kmRan km")
    }

    fun applyBrake(){
        println("Brakes applied successfully!")
    }

}