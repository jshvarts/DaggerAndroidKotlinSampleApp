package com.jshvarts.daggerandroidmvp.lobby

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jshvarts.daggerandroidmvp.R
import com.jshvarts.daggerandroidmvp.common.data.CommonHelloService
import javax.inject.Inject
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import dagger.android.*

class LobbyActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var commonHelloService: CommonHelloService

    @Inject
    lateinit var lobbyActivityHelloService: LobbyActivityHelloService

    @BindView(R.id.common_hello)
    lateinit var commonHelloTextView: TextView

    @BindView(R.id.lobby_hello)
    lateinit var lobbyHelloTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lobby_activity)

        ButterKnife.bind(this)

        sayCommonHello()

        sayLobbyHello()
        //println("call to CommonHelloService: " + commonHelloService.sayHello())
        //println("call to LobbyActivityHelloService: " + lobbyActivityHelloService.sayHello())
    }

    override fun androidInjector(): AndroidInjector<Any> {
       return androidInjector
    }

    private fun sayCommonHello() {
        commonHelloTextView.text = commonHelloService.sayHello()
    }

    private fun sayLobbyHello() {
        lobbyHelloTextView.text = lobbyActivityHelloService.sayHello()
    }
}

