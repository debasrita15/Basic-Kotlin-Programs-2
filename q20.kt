//Inside a runBlocking block, write code using async { } to calculate 5 + 5 and then use .await() to print the result.
import kotlinx.coroutines.*

fun main() = runBlocking {
    val result = async { 5 + 5 }
    println(result.await()) 
}
