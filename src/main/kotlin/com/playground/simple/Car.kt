package com.playground.simple

/*
    - dont work with val
    - need mutable collections
 */
data class Car(
    var wheels: MutableList<Wheel> = mutableListOf(),
    var color: String = "",
    var model: String = "",
    var engine: Engine? = null
)
{
    init {
        println("init $this")
    }
}
data class Wheel(
    var size: Int =0
)
data class Engine(
    var power: Int =0
)
