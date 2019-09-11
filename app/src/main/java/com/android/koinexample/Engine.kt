package com.android.koinexample

import com.android.koinexample.engine.Cylinder
import com.android.koinexample.engine.Piston

data class Engine(var piston: Piston, var cylinder: Cylinder) {
    init {
        makeEngine()
    }
    private fun makeEngine() = println("Make engine")
}