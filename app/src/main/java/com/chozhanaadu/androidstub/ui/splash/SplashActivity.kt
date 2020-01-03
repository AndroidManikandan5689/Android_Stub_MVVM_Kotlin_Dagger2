package com.chozhanaadu.androidstub.ui.splash

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.chozhanaadu.androidstub.R
import com.chozhanaadu.androidstub.databinding.ActivitySplashBinding
import com.chozhanaadu.androidstub.ui.base.BaseActivity

class SplashActivity : BaseActivity() {

    private val viewModel = SplashViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initbinding()
    }

    private fun initbinding(){
        val activityMainBinding =  DataBindingUtil.setContentView<ActivitySplashBinding>(this, R.layout.activity_splash)
        activityMainBinding.viewModel = viewModel
    }
}
