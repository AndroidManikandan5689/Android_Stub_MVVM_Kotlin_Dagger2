package com.chozhanaadu.androidstub.ui.base

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chozhanaadu.androidstub.R

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    open fun navigateActivity(activity: Class<out Activity?>) {
        startActivity(Intent(applicationContext, activity))
        overridePendingTransition(R.anim.slide_enter, R.anim.slide_leave)
        finish()
    }
}