package com.android.koinexample.badCar

import com.android.koinexample.Car

class BadCar : Car {

    var engine: BadEngine = BadEngine()
    var wheel: BadWheel = BadWheel()

    init {
        makeCar()
    }

    override fun makeCar() = println("Make bad car")
    override fun makeSomeNoise() = println("Beeepp!!!! - BEEEPP!!")

}