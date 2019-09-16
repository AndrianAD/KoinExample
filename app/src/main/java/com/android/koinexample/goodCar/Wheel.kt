package com.android.koinexample.goodCar

import com.android.koinexample.wheel.Disk
import com.android.koinexample.wheel.Tire

class Wheel(var disk: Disk, var tire: Tire) {

    init {
        makeWheel()
    }
    fun makeWheel() = println("Make Wheel")
}
