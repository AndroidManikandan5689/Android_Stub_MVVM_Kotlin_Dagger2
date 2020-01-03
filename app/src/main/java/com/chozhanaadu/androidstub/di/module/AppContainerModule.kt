package com.chozhanaadu.androidstub.di.module

import android.app.Application
import android.content.Context
import com.chozhanaadu.androidstub.data.local.pref.PreferencesHelper
import com.chozhanaadu.androidstub.data.remote.ApiHelper
import com.chozhanaadu.androidstub.di.annotations.DatabaseInfo
import com.chozhanaadu.androidstub.di.annotations.PreferenceInfo
import com.chozhanaadu.androidstub.utils.AppConstants
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppContainerModule {

    @Provides
    @Singleton
    fun provideApiHelper(apiHelper: ApiHelper): ApiHelper = apiHelper

    @Provides
    @Singleton
    fun provideContext(application: Application?): Context? = application

    @Provides
    @DatabaseInfo
    fun provideDatabaseName(): String = AppConstants.DB_NAME

    @Provides
    @PreferenceInfo
    fun providePreferenceName() : String = AppConstants.PREF_NAME

    @Provides
    @Singleton
    fun providePreferencesHelper(pref: PreferencesHelper) : PreferencesHelper = pref



}