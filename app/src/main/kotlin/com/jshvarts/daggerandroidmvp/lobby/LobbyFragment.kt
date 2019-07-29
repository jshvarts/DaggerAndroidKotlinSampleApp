package com.jshvarts.daggerandroidmvp.lobby

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder
import com.jshvarts.daggerandroidmvp.R
import dagger.android.AndroidInjection
import javax.inject.Inject

class LobbyFragment : Fragment() {

    @Inject
    lateinit var lobbyFragmentHelloService: LobbyFragmentHelloService

    @BindView(R.id.lobby_fragment_hello)
    lateinit var lobbyFragmentHelloTextView: TextView

    private lateinit var unbinder: Unbinder

    override fun onAttach(context: Context) {
        AndroidInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.lobby_fragment, container, false)
        unbinder = ButterKnife.bind(this, view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
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
