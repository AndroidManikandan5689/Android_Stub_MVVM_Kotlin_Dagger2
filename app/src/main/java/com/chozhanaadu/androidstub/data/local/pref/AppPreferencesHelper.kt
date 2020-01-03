package com.chozhanaadu.androidstub.data.local.pref

import android.content.Context
import android.content.SharedPreferences
import com.chozhanaadu.androidstub.di.annotations.PreferenceInfo
import javax.inject.Inject

class AppPreferencesHelper : PreferencesHelper {

    private val PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN"

    private var mPrefs: SharedPreferences? = null


    @Inject
    fun AppPreferencesHelper(context: Context, @PreferenceInfo prefFileName: String?) {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)
    }

    override fun getAccessToken(): String? {
        return mPrefs!!.getString(PREF_KEY_ACCESS_TOKEN, null)
    }

    override fun setAccessToken(accessToken: String?) {
        mPrefs!!.edit().putString(PREF_KEY_ACCESS_TOKEN, accessToken).apply()
    }
}