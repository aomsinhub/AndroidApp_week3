package example.myapp

class MyClass{
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

//fun String.hasSpaces(): Boolean {
//    val found = this.indexOf(' ')
//    // also valid: this.indexOf(" ")
//    // returns positive number index in String or -1 if not found
//    return found != -1
//}

fun String.hasSpaces() = indexOf(" ") != -1

fun main() {

}