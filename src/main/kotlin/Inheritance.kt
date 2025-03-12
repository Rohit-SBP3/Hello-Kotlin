fun main() {

    // Inheritance ( is a Relationship )...
    // Code re-usability...
    // open keyword to tell the compiler that class is open for inheritance...
    // First the parent constructor is being called and then the child constructor...
    // Multiple Inheritance is not supported...

    val device = BasicPhone()
    device.name = "Blueberry"
    device.type = "Keypad phone with bluetooth"
    device.model = "23er4"

    device.getPhoneInfo()
    device.playMusic()

    val d2 = SmartPhone()
    d2.playMovie()

}

open class Phone(){
    var name: String = "Nokia"
    var type: String = "Keypad phone"
    var model: String = "1110"

    fun makeCall() {
        println("Calling from $name")
    }

    fun switchOn(){
        println("$name is Switched On")
    }

    fun switchOff(){
        println("$name is Switched Off")
    }

    fun getPhoneInfo(){
        println("$name $type $model")
    }
}

class BasicPhone: Phone(){

    fun playMusic(){
        println("$name is playing music!")
    }

    fun getScreenInfo(){
        println("$name has small size screen")
    }

}

class SmartPhone: Phone(){

    fun playMovie(){
        println("$name is playing Movie")
    }

    fun takeSelfie(){
        println("$name is taking Selfie")
    }

    fun getScreenInfo(){
        println("$name has medium size screen")
    }

}