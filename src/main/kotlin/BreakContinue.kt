fun main () {
    val numbers = intArrayOf(1,2,3,4,5,6,7,8,9)

    for (n in numbers) {
        if (n == 2)
            continue
        println(n)
    }

    println("\n")

    for (n in numbers) {
        if (n%2 == 0)
            continue
        println(n)
    }

    println("\n")

    for (n in numbers) {
        if (n%2 == 0)
            continue
        if (n>6) break
        println(n)
    }

//    this is not allowed
    /*
    numbers.forEach {
        if (it == 2)
            break
    }
     */
}