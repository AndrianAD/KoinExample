package com.android.koinexample

import com.android.koinexample.car.Engine
import com.android.koinexample.car.Wheel
import com.android.koinexample.engine.Cylinder
import com.android.koinexample.engine.Piston
import com.android.koinexample.wheel.Disk
import com.android.koinexample.wheel.Steel
import com.android.koinexample.wheel.Tire
import org.koin.dsl.module

val firstModule= module {
    factory {Disk(get()) }
    factory {Tire() }
    factory { Wheel(get(), get()) }
    factory {Piston() }
    factory {Cylinder() }
    factory { Engine(get(), get()) }
    factory {Car(get(),get()) }
    factory {Steel() }
}