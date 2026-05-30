//Create a listOf("apple", "banana"). Write a one-liner using .map { } to create a new list containing the lengthsof those strings. 
fun main() {
    val lengths = listOf("apple", "banana").map { it.length }
    println(lengths) 
}
