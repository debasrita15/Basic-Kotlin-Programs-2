//Write an extension function for the String class called addExclamation() that returns the string with "!" appended to the end. (e.g., "Hello".addExclamation() becomes "Hello!").
fun String.addExclamation(): String = "$this!"

fun main() {
    println("Hello".addExclamation())
}
