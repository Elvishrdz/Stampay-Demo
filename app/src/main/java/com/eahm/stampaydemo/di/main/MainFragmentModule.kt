package com.eahm.stampaydemo.di.main

import com.eahm.stampaydemo.ui.dashboard.DashboardFragment
import com.eahm.stampaydemo.ui.home.HomeFragment
import com.eahm.stampaydemo.ui.notifications.NotificationsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentModule {

    @ContributesAndroidInjector
    abstract fun provideHomeFragment() : HomeFragment


    @ContributesAndroidInjector
    abstract fun provideDashboardFragment() : DashboardFragment


    @ContributesAndroidInjector
    abstract fun provideNotificationsFragment() : NotificationsFragment
}