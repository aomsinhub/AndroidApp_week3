package example.myapp

fun main(){
    val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )
//    println (scientific.get("guppy"))
//    println(scientific.get("zebra fish"))
//    println("scientific.get("swordtail"")
//    println(scientific.getOrDefault("swordtail", "sorry, I don't know"))
    println(scientific.getOrElse("swordtail") {"sorry, I don't know"})
}