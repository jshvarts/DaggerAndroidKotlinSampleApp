package com.jshvarts.daggerandroidsampleapp.lobby

import dagger.Module
import dagger.Provides

@Module
class LobbyFragmentModule {

    @Provides
    fun provideLobbyFragmentHelloService() = LobbyFragmentHelloService()
}