package com.chozhanaadu.androidstub.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: Application) {

    @Provides
    @Singleton
    fun application(): Application? = application

    @Provides
    @Singleton
    fun provideContext(): Context = application
}