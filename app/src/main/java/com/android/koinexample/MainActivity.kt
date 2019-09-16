package com.android.koinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.koinexample.badCar.BadCar
import com.android.koinexample.goodCar.Engine
import com.android.koinexample.goodCar.GoodCar
import com.android.koinexample.goodCar.Wheel
import com.android.koinexample.engine.Cylinder
import com.android.koinexample.engine.Piston
import com.android.koinexample.wheel.Disk
import com.android.koinexample.wheel.Steel
import com.android.koinexample.wheel.Tire
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.inject
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity(), KoinComponent {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startKoin { modules(firstModule) }


        //1 Bad Example
        val badCar = BadCar()
        badCar.makeSomeNoise()


        //2 Constructor Example
        val car1 = GoodCar(Engine(Piston(), Cylinder()), Wheel(Disk(Steel()), Tire()))
        car1.makeSomeNoise()


        //3
        val car2: GoodCar by inject()
        car2.makeSomeNoise()

        //4
        val car: Car by inject(named("BadCar"))
        car.makeSomeNoise()


    }


}


//val mainActivityViewModel: MainActivityViewModel = getViewModel()
//        val secondViewModel: SecondViewModel = getViewModel()
//
//
//        mainActivityViewModel.doSomeJobMainActivityViewModel()
//        secondViewModel.doSomeJobSecondViewModel()
