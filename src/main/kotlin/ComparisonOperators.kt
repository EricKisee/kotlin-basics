fun main () {
    val n1 = 10
    val n2 = 20

    println(n1==n2)
    println(n1>n2)
    println(n1<n2)
    println(n1>=n2)
    println(n1<=n2)

    if (n1 < n2){
        println("What's Popping!!")
    }else if (n1 > n2){
    }
    else {
        println("Nothing")
    }

    val value = if (n1>=n2 || n1<=30){
        println("****")
        "$$$$"
    } else {
        println("&&&&")
        "####"
    }

    println(value)



}