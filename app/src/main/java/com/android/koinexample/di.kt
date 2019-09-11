package com.android.koinexample

import com.android.koinexample.engine.Cylinder
import com.android.koinexample.engine.Piston
import com.android.koinexample.wheel.Disk
import com.android.koinexample.wheel.Tire
import org.koin.dsl.module

val Module= module {
    factory {Disk() }
    factory {Tire() }
    factory {Wheel(get(),get()) }
    factory {Piston() }
    factory {Cylinder() }
    factory {Engine(get(),get()) }
    factory {Car(get(),get()) }
}