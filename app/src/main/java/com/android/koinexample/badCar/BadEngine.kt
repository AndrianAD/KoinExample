package com.android.koinexample.badCar

import com.android.koinexample.engine.Cylinder
import com.android.koinexample.engine.Piston

class BadEngine {
    var piston: Piston = Piston()
    var cylinder: Cylinder = Cylinder()

    init {
        makeEngine()
    }

    private fun makeEngine() = println("Make bad engine")
}