package com.jshvarts.daggerandroidsampleapp.di

import android.app.Application
import com.jshvarts.daggerandroidsampleapp.common.data.CommonHelloService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun provideContext(application: Application) = application.applicationContext

    @Singleton
    @Provides
    fun providesCommonHelloService() = CommonHelloService()
}