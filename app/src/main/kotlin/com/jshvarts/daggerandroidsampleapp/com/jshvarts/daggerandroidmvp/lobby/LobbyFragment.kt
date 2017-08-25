package com.jshvarts.daggerandroidsampleapp.lobby


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder
import com.jshvarts.daggerandroidsampleapp.R
import com.jshvarts.daggerandroidsampleapp.di.Injectable
import javax.inject.Inject

class LobbyFragment : Fragment(), Injectable {

    @Inject
    lateinit var lobbyFragmentHelloService: LobbyFragmentHelloService

    @BindView(R.id.lobby_fragment_hello)
    lateinit var lobbyFragmentHelloTextView: TextView

    lateinit var unbinder: Unbinder

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.lobby_fragment, container, false)
        unbinder = ButterKnife.bind(this, view)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sayFragmentHello()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        unbinder.unbind()
    }

    private fun sayFragmentHello() {
        lobbyFragmentHelloTextView.text = lobbyFragmentHelloService.sayHello()
    }
}