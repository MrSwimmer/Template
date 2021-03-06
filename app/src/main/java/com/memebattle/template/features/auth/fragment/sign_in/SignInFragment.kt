package com.memebattle.template.features.auth.fragment.sign_in

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.memebattle.template.R
import kotlinx.android.synthetic.main.fragment_sign_in.view.*

class SignInFragment : Fragment() {

    lateinit var viewModel: SignInViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_sign_in, container, false)
        viewModel = ViewModelProviders.of(this).get(SignInViewModel::class.java)
        viewModel.user.observe(this, Observer {

        })
        viewModel.error.observe(this, Observer {

        })
        v.gotoSignUpButton.setOnClickListener {

        }
        v.signInButton.setOnClickListener {
            viewModel.signIn("")
        }
        return v
    }
}
