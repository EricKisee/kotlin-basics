fun main () {
    val n1 = 31
    val n2 = 20


//    tanary in java
//    var result = n1>=n2 ? "Truee":"Falsee

//    in Kotlin
    val v = if (n1>=n2) ":]" else ":["
    println(v)

    val v1 = if (n1>=n2) ":]"
            else if (n1 == 100) "Hooray"
            else if (n1 == 200) "Hooray*200"
            else ":["

}