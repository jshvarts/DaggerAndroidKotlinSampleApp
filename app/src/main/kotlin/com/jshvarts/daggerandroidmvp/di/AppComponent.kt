package com.jshvarts.daggerandroidmvp.di

import com.jshvarts.daggerandroidmvp.App
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        ActivitiesModule::class
))
interface AppComponent {
    fun inject(app: App)
}
