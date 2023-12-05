fun main () {
    val name: String = "Jamila"

    val names = arrayOf<String>("jamila", "james")

    println(names[0])
    names[0] = "Eric"
    println(names.size)

    if ("hello" in names) {
        println("found")
    } else {
        println("not found")
    }

    println(names.contentToString())

    val arrayOfNulls = arrayOfNulls<String>(5)
    println(arrayOfNulls.contentToString())

    arrayOfNulls.fill("$$")
    arrayOfNulls[3] = "Crazy"
    println(arrayOfNulls.contentToString())

}


