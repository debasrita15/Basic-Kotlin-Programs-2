// Inside a fun main() = runBlocking { } block, use launch { } to start a background coroutine that prints "Background task finished".
fun main() {
    val thread = Thread {
        println("Background task finished")
    }
    thread.start()
    thread.join()
}
