package com.playground.builder

@DslMarker
annotation class CarDsl

@CarDsl
class CarBuilder{
    private var wheels: MutableList<Wheel> = mutableListOf()
    var color: String =""

    fun color(lambda: ()->String){
        color = lambda()
    }

    var model: String=""
    infix fun String.mustBe(str: String) {
        model = str
    }
    private var engine: Engine = Engine(power=0)
    fun build(): Car = Car(
        wheels = wheels.toList(),
        color = color,
        model = model,
        engine = engine
    )

    fun wheels(block: Wheels.() -> Unit) {
        wheels.addAll(Wheels().apply(block))
    }

//    fun wheel(block: WheelBuilder.() -> Unit) {
//        wheels.add(WheelBuilder().apply(block).build())
//    }

    fun engine(block: EngineBuilder.() ->Unit){
        engine = EngineBuilder().apply(block).build()
    }
}
@CarDsl
class Wheels: ArrayList<Wheel>() {
    fun wheel(block: WheelBuilder.() -> Unit) {
        add(WheelBuilder().apply(block).build())
    }

}
@CarDsl
class WheelBuilder{
    var size: Int = 0
    fun build(): Wheel = Wheel(
        size = size
    )
}

@CarDsl
class EngineBuilder {
    var power: Int = 0
    fun build(): Engine = Engine(
        power = power
    )
}

fun car(block: CarBuilder.() -> Unit): Car = CarBuilder().apply(block).build()

