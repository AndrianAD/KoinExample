package com.android.koinexample.badCar

class BadCar {

    var engine: BadEngine = BadEngine()
    var wheel: BadWheel = BadWheel()

    init {
        makeCar()
    }

    fun makeCar() = println("Make bad car")
    fun makeSomeNoise() = println("Beeepp!!!! - BEEEPP!!")

}