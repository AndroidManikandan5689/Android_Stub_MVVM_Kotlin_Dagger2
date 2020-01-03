package com.chozhanaadu.androidstub.di.module

import com.chozhanaadu.androidstub.ui.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector()
    abstract fun contributeSplashActivity() : SplashActivity
}