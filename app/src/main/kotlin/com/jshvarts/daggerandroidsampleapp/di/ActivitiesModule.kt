package com.jshvarts.daggerandroidsampleapp.di

import com.jshvarts.daggerandroidsampleapp.lobby.LobbyActivity
import com.jshvarts.daggerandroidsampleapp.lobby.LobbyActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {

    @ContributesAndroidInjector(modules = arrayOf(LobbyActivityModule::class, FragmentsModule::class))
    abstract fun bindLobbyActivity(): LobbyActivity
}