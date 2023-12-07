fun main () {
    var number = 1

    while (number<5) {
        println("Number $number")
        ++number
    }

    val brand = "Eric Kisee"

    var index = brand.length-1
    while (index>=0){
        println("Number $index - ${brand[index]}")
        index--
    }
}