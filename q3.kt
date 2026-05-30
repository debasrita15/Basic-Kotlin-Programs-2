// Create an open class Vehicle with a function startEngine(). Create a Motorcycle subclass that inherits from it and overrides startEngine() to print "Vroom!". 
open class Vehicle {
    open fun startEngine() { println("Engine started") }
}

class Motorcycle : Vehicle() {
    override fun startEngine() { println("Vroom!") }
}

fun main() {
    Motorcycle().startEngine()
}
