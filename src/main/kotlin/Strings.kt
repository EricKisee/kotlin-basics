fun main (){
    val name = "Ahmed"
    println(name)
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())

    println(name[0])
    println(name[4])

    val age = 20
    val  msg = "Name $name, Age $age"
    println(msg)

    val email = """
        Hello %s
        How 
            are you?
    """.trimIndent()

    println(email.format(name))

}