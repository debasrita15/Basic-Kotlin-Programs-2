//Write a data class User that holds an id (Int), username (String), and isActive (Boolean).
data class User(val id: Int, val username: String, val isActive: Boolean)

fun main() {
    val u = User(60, "Debasrita", true)
    println(u)
}
