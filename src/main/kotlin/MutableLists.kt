fun main () {
    val names = mutableListOf(
        "Jamila",
        "Jama",
        "Saleh",
        "Peter"
    )

    println(names[2])

    println(names)

    println(names.contains("Eric"))

    println(names.first())
    println(names.last())
    println(names.indexOf("Peter"))

    names.remove("Saleh")
    println(names)
    names.add("Saleh")
    println(names)

    println(names.isEmpty())

    println(mutableListOf<Any>().isEmpty())
}