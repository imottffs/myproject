package com.aa

fun main(args: Array<String>) {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human()
    h.hello()
    var age  = 19;//kotlin 會針對等號右邊的資料型態，來推斷變數型態
    age = 20
    var weight =66.5
    var name : String
    name ="Hnak"

}
class Human{
    fun hello(){
        println("Hello kotlin!")
    }
}