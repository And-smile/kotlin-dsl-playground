package com.playground.simple

fun main() {
    val testCar: Car = car {
        model = "test"
        color = "test"
        wheel {
            size = 20
        }
        wheel {
            size = 20
        }
        engine {
            power = 500
        }
    }
    println(testCar)
    val standard = Car(
        model = "test",
        color = "test",
        wheels = mutableListOf(Wheel(size = 20)),
        engine = Engine(power = 500)
    )
    println(standard)

}
