package com.chozhanaadu.androidstub.di.component

import android.app.Application
import com.chozhanaadu.androidstub.AppController
import com.chozhanaadu.androidstub.di.module.ActivityModule
import com.chozhanaadu.androidstub.di.module.AppContainerModule
import com.chozhanaadu.androidstub.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ActivityModule::class, AppContainerModule::class, NetworkModule::class, AndroidSupportInjectionModule::class))
interface AppComponent {

    // This is our custom application class
    fun inject(app: AppController)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

}