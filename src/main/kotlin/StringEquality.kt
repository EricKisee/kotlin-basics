fun main (){
    val name1 = "Eric"
    val name2 = "eric"
    val name3 = "Eric"
    val name4 = String("Eric".toCharArray())

    println(name1==name4)
    println(name1===name4)
    println(name1.equals(name4))
 }