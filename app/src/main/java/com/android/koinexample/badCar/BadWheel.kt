package com.android.koinexample.badCar

import com.android.koinexample.wheel.Disk
import com.android.koinexample.wheel.Steel
import com.android.koinexample.wheel.Tire

class BadWheel {
    var disk: Disk = Disk(Steel())
    var tire: Tire = Tire()

    init {
        makeWheel()
    }

    fun makeWheel() = println("Make bad Wheel")
}