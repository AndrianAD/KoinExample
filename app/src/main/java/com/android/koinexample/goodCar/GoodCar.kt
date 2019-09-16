package com.android.koinexample.goodCar

import com.android.koinexample.Car

class GoodCar(var engine: Engine, var wheel: Wheel) : Car {
    init {
        makeCar()
    }
    override fun makeCar() = println("Make car")
    override fun makeSomeNoise() = println("Beeepp!!!! - BEEEPP!!")

}