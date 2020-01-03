package com.chozhanaadu.androidstub.data.local.pref

interface PreferencesHelper {
    fun getAccessToken(): String?

    fun setAccessToken(accessToken: String?)
}