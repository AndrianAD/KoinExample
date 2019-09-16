package com.android.koinexample

import com.android.koinexample.goodCar.Engine
import com.android.koinexample.goodCar.GoodCar
import com.android.koinexample.goodCar.Wheel
import com.android.koinexample.engine.Cylinder
import com.android.koinexample.engine.Piston
import com.android.koinexample.wheel.Disk
import com.android.koinexample.wheel.Tire
import org.koin.core.KoinComponent
import org.koin.core.get
import org.koin.core.inject

class KoinApp : KoinComponent {

    val disk: Disk by inject()
    val tire: Tire by inject()
    val wheel: Wheel by inject()

    val piston: Piston = get()
    val piston2: Piston by inject()

    val cylinder: Cylinder by inject()
    val engine: Engine by inject()


    val car: GoodCar by inject()


}

