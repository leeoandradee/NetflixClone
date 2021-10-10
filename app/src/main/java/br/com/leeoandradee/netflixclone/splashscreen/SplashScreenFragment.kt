package br.com.leeoandradee.netflixclone.splashscreen

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import br.com.leeoandradee.netflixclone.R
import br.com.leeoandradee.netflixclone.base.BaseFragment

class SplashScreenFragment : BaseFragment() {

    override val layout = R.layout.fragment_splash_screen

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        Handler().postDelayed({
            findNavController().navigate(R.id.LoginFragment)
        }, 3000)
    }
}