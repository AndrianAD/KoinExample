package com.android.koinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.koinexample.badCar.BadCar
import com.android.koinexample.badCar.BadEngine
import com.android.koinexample.badCar.BadWheel
import com.android.koinexample.car.Engine
import com.android.koinexample.car.Wheel
import com.android.koinexample.engine.Cylinder
import com.android.koinexample.engine.Piston
import com.android.koinexample.wheel.Disk
import com.android.koinexample.wheel.Steel
import com.android.koinexample.wheel.Tire
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startKoin { modules(firstModule) }

        var car1 = Car(Engine(Piston(), Cylinder()), Wheel(Disk(Steel()), Tire()))
        car1.makeSomeNoise()

        var car3= BadCar()
        car3.makeSomeNoise()







//        var car2=KoinApp().car
//        car2.makeSomeNoise()
//
//        var car4=Car(KoinApp().engine,KoinApp().wheel)
//        car4.makeSomeNoise()


    }


}
