// Given val input: String? = "Kotlin", write a safe .let { } block using the ? operator that prints the length of the string only if it is not null.
fun main() {
    val input: String? = "Kotlin"
    input?.let { println(it.length) } // 6
}
