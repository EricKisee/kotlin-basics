fun main (){
//    objects
    val  tv = SmartDevice("Sony", 100000.0,false)
    println("${tv.brand} ${tv.price}")
    tv.turnOff()

    val phone = SmartDevice("Apple", 120000.0, true)
    println("${phone.brand} ${phone.price}")
    phone.turnOn()
    phone.getDeviceState()

    val watch = SmartDevice ()
    val tab = SmartDevice ("Samsung")
    val tab2 = SmartDevice ("Samsung")

    println("== ${tab==tab2}")
    println("=== (memory location) ${tab===tab2}")

    println(watch)
    println(tab)
}

//Blueprint
class SmartDevice (
    var brand:String? = null,
    var price:Double? = null,
    var isSwitchedOn:Boolean=false
) {

    constructor() : this("",0.0)
    constructor( brand: String): this (brand,0.0)

//    properties - variables
//    var brand =brand
//    Getters and Setters
    /*
    get() = field
    set(value) {
        field=value
    }

     */
//    var price=price
//    var isSwitchedOn = isSwitchedOn


//    behaviours -

    fun getDeviceState () {
        println("$brand is on: $isSwitchedOn")
    }
    fun turnOn (){
        isSwitchedOn=true
        println("$brand is turning on!")
    }

    fun turnOff (){
        isSwitchedOn=false
        println("$brand is turning off!")
    }

    override fun toString(): String {
        return "SmartDevice(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (isSwitchedOn != other.isSwitchedOn) return false

        return true
    }

    override fun hashCode(): Int {
        var result = brand?.hashCode() ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + isSwitchedOn.hashCode()
        return result
    }


}