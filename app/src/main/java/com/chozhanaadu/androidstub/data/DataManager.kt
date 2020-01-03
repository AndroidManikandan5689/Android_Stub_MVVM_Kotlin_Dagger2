package com.chozhnaadu.androidstub.data

import com.chozhanaadu.androidstub.data.local.db.DbHelper
import com.chozhanaadu.androidstub.data.local.pref.PreferencesHelper
import com.chozhanaadu.androidstub.data.remote.ApiHelper

interface DataManager : DbHelper, PreferencesHelper, ApiHelper {

}