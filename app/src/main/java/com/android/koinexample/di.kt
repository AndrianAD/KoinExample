package com.android.koinexample

import com.android.koinexample.badCar.BadCar
import com.android.koinexample.goodCar.Engine
import com.android.koinexample.goodCar.GoodCar
import com.android.koinexample.goodCar.Wheel
import com.android.koinexample.engine.Cylinder
import com.android.koinexample.engine.Piston
import com.android.koinexample.wheel.Disk
import com.android.koinexample.wheel.Steel
import com.android.koinexample.wheel.Tire
import org.koin.androidx.experimental.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import org.koin.experimental.builder.factory

val firstModule= module {
    factory {Disk(get()) }
    factory {Tire() }
    factory { Wheel(get(), get()) }
    factory {Piston() }
    factory {Cylinder() }
    factory { Engine(get(), get()) }
    factory { GoodCar(get(), get()) }
    factory {Steel() }

    factory<Car>(named("BadCar")) { BadCar() }
    factory<Car>(named("GoodCar")){ GoodCar(get(), get()) }

    // ViewModel
    viewModel<MainActivityViewModel>()
    viewModel<SecondViewModel>()
}