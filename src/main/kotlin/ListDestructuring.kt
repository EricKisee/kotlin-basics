fun main () {
    val names: List<String> = listOf(
        "Jamila",
        "Jama",
        "Saleh",
        "Peter"
    )

    val (one, two, three) = names

    println("$one $two $three")

    val (one1, two2, _ , four4) = names
    println("$one1 $two2 $four4")


}