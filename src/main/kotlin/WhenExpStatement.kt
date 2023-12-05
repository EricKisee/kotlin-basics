fun main (){
    val gender = "f"

    when (gender) {
        "f" -> println("female")
        "m" -> println("male")
        else -> println("Unknown Gender")
    }

    val g = when (gender) {
        "f" -> "female"
        "m" -> "male"
        else -> "Unknown Gender"
    }
    println(g)
}