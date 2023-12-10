fun main () {
    println("hello")
    greet()
    greet("Bob", 16)
    greet("kisee")
    greet(age=18, name = "Eric")

    foo (bar = {
        println("Bar as a function")
    })

//    Only works if the function is the last Argument
    foo {
        println("Function as a Parameter")
    }
//    Will have an error
/*
    foo2 {
        println("Function as a Parameter")
    }

 */
    foo2(bar = ({
        println("Function as a parameter")
    }),
        name = "Eric Kisee Mulwa")

    foo {
    }

    val d = double(20)
    println(d)

    println(doubled(2))

    val (v1,v2) = twoValues()
    println("$v1 $v2")
    val (t1,t2,t3) = threeValues()
    println("$t1 $t2 $t3")
    val (name,age) = twoValued()
    println("Name $name : Age $age")

}

//Multiple return types
fun twoValues() : Pair<String, Int>{
    return "Amigos" to 20
}

fun twoValued () : Pair <String, Int> = Pair ("Eric Kisee", 30)

fun threeValues () : Triple <String, Int, Char>{
    return  Triple (
        "Amigos",
        20,
        'z'
    )
}

fun double (n:Int) : Int{
    return(n*2)
}

//function as single expression
fun doubled (n:Int) : Int = n*2

//return type not a must in a single function expression
fun squared (n:Int) = n*n

fun greet () {
    println("Hallo world")
}

fun greet (name: String, age: Int = -1) {
    println("hello $name")
    if (age == -1 ) {
        println("age not provided")
        return
    }
    if (age >= 16 ) {
        println("$name age $age is an adult")
    }else {
        println("$name age $age is not an adult")
    }
}

fun foo (bar: () -> Unit) {
    println("Bar function")
    bar()
}

fun foo2 (bar: ()->Unit, name:String = ""){
    println("Bar Function for $name")
}