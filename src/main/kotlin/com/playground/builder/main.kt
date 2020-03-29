package com.playground.builder

fun main() {
    val testCar: Car = car {
        model mustBe "test"
        color {"test"}
        engine {
            power = 500
//            color = "ups" restrict using @DslMarker
        }
        wheels {
            wheel{
                size=30
//                restrict using @DslMarker
//                wheels {
//                    model = "ups"
//                }
            }
            wheel {
                size = 30
            }
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
