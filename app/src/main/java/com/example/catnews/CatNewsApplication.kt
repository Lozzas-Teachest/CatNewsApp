package com.example.catnews

import android.app.Application
import com.example.catnews.di.AppComponent
import com.example.catnews.di.DaggerAppComponent
import com.example.catnews.json_parser.JsonParser

open class CatNewsApplication : Application() {

    val appComponent: AppComponent = DaggerAppComponent.factory().create(applicationContext)

//    val appComponent: AppComponent by lazy {
//        DaggerAppComponent.factory().create(applicationContext)
//    }

    open val jsonParser by lazy {
        JsonParser()
    }
}