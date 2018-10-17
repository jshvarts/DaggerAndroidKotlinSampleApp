package com.jshvarts.daggerandroidsampleapp.lobby

import android.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jshvarts.daggerandroidsampleapp.R
import com.jshvarts.daggerandroidsampleapp.common.data.CommonHelloService
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.HasFragmentInjector
import javax.inject.Inject
import dagger.android.DispatchingAndroidInjector
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife


class LobbyActivity : AppCompatActivity(), HasFragmentInjector {

    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

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

    override fun fragmentInjector(): AndroidInjector<Fragment> = fragmentDispatchingAndroidInjector

    private fun sayCommonHello() {
        commonHelloTextView.text = commonHelloService.sayHello()
    }

    private fun sayLobbyHello() {
        lobbyHelloTextView.text = lobbyActivityHelloService.sayHello()
    }
}

