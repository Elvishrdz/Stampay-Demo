package com.eahm.stampaydemo.di

import com.eahm.stampaydemo.di.main.MainFragmentModule
import com.eahm.stampaydemo.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppActivityModule{

    @ContributesAndroidInjector(modules = [
        MainFragmentModule::class
    ])
    abstract fun provideMainActivity() : MainActivity

}