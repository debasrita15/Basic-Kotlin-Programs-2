// Write a suspend fun fetchWeather(): String that uses delay() to wait 1000ms, then returns "Sunny". 
import kotlinx.coroutines.*

suspend fun fetchWeather(): String {
    delay(1000)
    return "Sunny"
}

fun main() = runBlocking {
    println(fetchWeather())
}
