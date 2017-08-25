package com.jshvarts.daggerandroidsampleapp.di

import com.jshvarts.daggerandroidsampleapp.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        ActivitiesModule::class))
interface AppComponent {
    @Component.Builder
    interface Builder {
      @BindsInstance
      fun application(app: App) : Builder
      fun build(): AppComponent
    }
    fun inject(app: App)
}