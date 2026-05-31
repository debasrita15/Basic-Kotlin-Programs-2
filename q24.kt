//Write a function fun buildFile(filename: String): File. Inside the function, instantiate a File 
//object. Chain an .apply { } block to set its permissions to "Read/Write". Then chain an 
//.also { } block to log "File $filename created" to the console. Finally, return the configured 
//object. 
fun main() {
    buildFile("notes.txt")
}

data class File(val name: String, var readable: Boolean = false, var writable: Boolean = false)

fun buildFile(filename: String): File {
    return File(filename)
        .apply { writable = true; readable = true }
        .also  { println("File $filename created") }
}
