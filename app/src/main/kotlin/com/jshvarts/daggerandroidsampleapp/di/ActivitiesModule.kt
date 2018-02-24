package com.jshvarts.daggerandroidsampleapp.di

import com.jshvarts.daggerandroidsampleapp.com.jshvarts.daggerandroidmvp.lobby.LobbyActivity
import com.jshvarts.daggerandroidsampleapp.lobby.LobbyActivityModule
import com.jshvarts.daggerandroidsampleapp.lobby.LobbyFragment
import com.jshvarts.daggerandroidsampleapp.lobby.LobbyFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {

    @ContributesAndroidInjector(modules = arrayOf(LobbyActivityModule::class))
    abstract fun bindLobbyActivity(): LobbyActivity

    @ContributesAndroidInjector(modules = arrayOf(LobbyFragmentModule::class))
    // or access to lobby dependencies from fragment via:
    // @ContributesAndroidInjector(modules = {LobbyFragmentModule.class, LobbyActivityModule.class})
    abstract fun bindLobbyFragment(): LobbyFragment
}