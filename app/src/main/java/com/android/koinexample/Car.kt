package com.android.koinexample

import com.android.koinexample.car.Engine
import com.android.koinexample.car.Wheel

class Car(var engine: Engine, var wheel: Wheel){
    init {
        makeCar()
    }
    fun makeCar() = println("Make car")
    fun makeSomeNoise() = println("Beeepp!!!! - BEEEPP!!")

}