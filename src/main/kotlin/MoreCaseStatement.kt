fun main () {
    val n1 = 10
    val n2 = 20

//    if else to when expression
    when {
        (n1<n2) -> println(":]")
        (n1 == 10) -> println("foo")
        else -> println(":[")
    }

    val age = 13

    when (age) {
        in 13..19 -> println("teenager")
        !in 0..12 -> println("not baby")
        else -> println("baby")
    }
}
