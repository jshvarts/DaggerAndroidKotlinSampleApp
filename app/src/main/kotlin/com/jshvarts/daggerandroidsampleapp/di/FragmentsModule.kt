package com.jshvarts.daggerandroidsampleapp.di

import com.jshvarts.daggerandroidsampleapp.lobby.LobbyFragment
import com.jshvarts.daggerandroidsampleapp.lobby.LobbyFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by nkoroi on 25/08/17.
 */

@Module
abstract class FragmentsModule {
  @ContributesAndroidInjector(modules = arrayOf(LobbyFragmentModule::class))
  abstract fun contributeLobbyFragment(): LobbyFragment
}