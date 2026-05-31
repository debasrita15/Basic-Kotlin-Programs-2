//Create an abstract class Shape with an abstract fun calculateArea(): Double. Create 
//Circle and Square subclasses. Write a Higher-Order Function fun 
//processShapes(shapes: List<Shape>, action: (Double) -> Unit). Iterate through the list, 
//calculate each area, and pass the result into the action lambda. 
import kotlin.math.PI

abstract class Shape {
    abstract fun calculateArea(): Double
}

class Circle(private val radius: Double) : Shape() {
    override fun calculateArea() = PI * radius * radius
}

class Square(private val side: Double) : Shape() {
    override fun calculateArea() = side * side
}

fun processShapes(shapes: List<Shape>, action: (Double) -> Unit) {
    shapes.forEach { action(it.calculateArea()) }
}

fun main() {
    val shapes = listOf(Circle(5.0), Square(4.0))
    processShapes(shapes) { area -> println("Area: ${"%.2f".format(area)}") }
}
