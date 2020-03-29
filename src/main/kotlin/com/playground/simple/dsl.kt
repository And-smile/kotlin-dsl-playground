package com.playground.simple

fun car(block: Car.() -> Unit): Car = Car()
    .apply(block)
fun Car.engine(block: Engine.() -> Unit){
    engine = Engine().apply(block)
}
fun Car.wheel(block: Wheel.() -> Unit){
    wheels.add(Wheel().apply(block))
}
