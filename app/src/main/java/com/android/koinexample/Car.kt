package com.android.koinexample

class Car( var engine: Engine, var wheel: Wheel){
    init {
        makeCar()
    }
    fun makeCar() = println("Make car")
    fun makeSomeNoise() = println("Beeepp!!!! - BEEEPP!!")

}