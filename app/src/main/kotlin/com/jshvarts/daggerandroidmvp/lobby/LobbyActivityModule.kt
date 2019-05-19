package com.jshvarts.daggerandroidmvp.lobby

import dagger.Module
import dagger.Provides

@Module
class LobbyActivityModule {

    @Provides
    fun provideLobbyActivityHelloService() = LobbyActivityHelloService()
}
