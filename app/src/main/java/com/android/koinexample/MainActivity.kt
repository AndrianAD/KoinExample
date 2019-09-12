package com.android.koinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.koinexample.badCar.BadCar
import com.android.koinexample.car.Engine
import com.android.koinexample.car.Wheel
import com.android.koinexample.engine.Cylinder
import com.android.koinexample.engine.Piston
import com.android.koinexample.wheel.Disk
import com.android.koinexample.wheel.Steel
import com.android.koinexample.wheel.Tire
import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.get
import org.koin.core.inject

class MainActivity : AppCompatActivity(), KoinComponent {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startKoin { modules(firstModule) }


        val badCar= BadCar()
        badCar.makeSomeNoise()


        val car1 = Car(Engine(Piston(), Cylinder()), Wheel(Disk(Steel()), Tire()))
        car1.makeSomeNoise()

        val car2: Car by inject()
        car2.makeSomeNoise()



//        val car2=KoinApp().car
//        car2.makeSomeNoise()
//
//
//        val car: Car by inject()
//        car.makeCar()
//
//        val car5:Car = get()
//        car5.makeCar()
    }


}
