package com.jshvarts.daggerandroidsampleapp.lobby

import dagger.Module
import dagger.Provides

@Module
class LobbyActivityModule {

    @Provides
    fun provideLobbyActivityHelloService() = LobbyActivityHelloService()
}