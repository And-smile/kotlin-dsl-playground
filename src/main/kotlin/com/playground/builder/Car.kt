package com.playground.builder

/* Drawbacks:
    - dont work with val
    - need mutable collections
 */
data class Car(
    val wheels: List<Wheel> ,
    val color: String,
    val model: String,
    val engine: Engine
)
{
    init {
        println("init $this")
    }
}
data class Wheel(
    val size: Int
)
data class Engine(
    val power: Int
)
