package com.jshvarts.daggerandroidmvp

import android.app.Activity
import android.app.Application
import com.jshvarts.daggerandroidmvp.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject


class App : Application(), HasActivityInjector {
    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent
                .create()
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}
