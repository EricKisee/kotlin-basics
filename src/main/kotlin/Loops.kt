fun main (){
    val names = listOf("mary", "ali", "alex")
    val numbers = intArrayOf(1,2,3,4,5)

    for (name in names) {
        println(name)
    }

    for ( name in names) {
        val n = name.replaceFirstChar {
            it.uppercase()
        }
        println(n)
    }

    for (number in numbers)
        println(number)
}