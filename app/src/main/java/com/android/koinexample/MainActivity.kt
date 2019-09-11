package com.android.koinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.koinexample.engine.Cylinder
import com.android.koinexample.engine.Piston
import com.android.koinexample.wheel.Disk
import com.android.koinexample.wheel.Tire
import org.koin.android.ext.android.inject
import org.koin.core.context.startKoin
import org.koin.dsl.koinApplication

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startKoin { modules(Module) }

        var car1 = Car(Engine(Piston(), Cylinder()), Wheel(Disk(), Tire()))
        car1.makeSomeNoise()


        var car2=KoinApp().car
        car2.makeSomeNoise()

    }


}
