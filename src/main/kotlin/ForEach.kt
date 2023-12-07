fun main () {
    val names = listOf(
        "Jamila",
        "James",
        "Salah",
        "Peter"
    )

    names.forEach{
        println(it)
    }

    println("\n")

    names .forEach({
        println(it)
    })

    println("\n")

    for (name in names) println(name)
}