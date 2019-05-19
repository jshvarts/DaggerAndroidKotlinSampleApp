package com.jshvarts.daggerandroidmvp.lobby

import dagger.Module
import dagger.Provides

@Module
class LobbyFragmentModule {

    @Provides
    fun provideLobbyFragmentHelloService() = LobbyFragmentHelloService()
}
