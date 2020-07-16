package com.eahm.stampaydemo.di

import android.app.Application
import com.eahm.stampaydemo.application.StampayDemoApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [
    AppActivityModule::class,
    AndroidInjectionModule::class
])
interface AppComponent : AndroidInjector<StampayDemoApp> {

    @Component.Builder
    interface Builder {

        @BindsInstance fun application(app : Application) : Builder

        fun build() : AppComponent
    }


    override fun inject(instance: StampayDemoApp)
}