//Instantiate a User from the previous question. Write one line of code using .copy() to create a new user with the exact same ID and username, but set isActive to false.
data class User(val id: Int, val username: String, val isActive: Boolean)

fun main() {
    val user = User(60, "Debasrita", true)
    val inactiveUser = user.copy(isActive = false)
    println(inactiveUser)
}
