//Write a class Thermostat with a var temperature: Double. Give it a private set so it can only be modified from within the class. 
class Thermostat {
    var temperature: Double = 20.0
        private set
    fun setTemp(value: Double) { temperature = value }
}

fun main() {
    val t = Thermostat()
    t.setTemp(25.0)
    println(t.temperature)
}
