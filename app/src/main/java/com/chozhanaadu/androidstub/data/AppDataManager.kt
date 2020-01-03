package com.chozhnaadu.androidstub.data

import android.content.Context
import com.chozhanaadu.androidstub.data.local.db.DbHelper
import com.chozhanaadu.androidstub.data.local.pref.PreferencesHelper
import com.chozhanaadu.androidstub.data.model.db.User
import com.chozhanaadu.androidstub.data.remote.ApiHelper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDataManager @Inject constructor(val context: Context, val dbHelper: DbHelper, val prefHelper: PreferencesHelper, val apiHelper: ApiHelper, val gson: Gson) : DataManager {


    override fun getAccessToken(): String? {
        return prefHelper.getAccessToken()
    }


    override fun setAccessToken(accessToken: String?) {
        prefHelper.setAccessToken(accessToken)
//        apiHelper.getApiHeader().getProtectedApiHeader().setAccessToken(accessToken)
    }

    override fun getAllDistrict(): Call<ResponseBody?>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllThoguthi(id: String?): Call<ResponseBody?>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun login(RequestBody: RequestBody?): Call<ResponseBody?>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun register(requestBody: RequestBody?): Call<ResponseBody?>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllUsers(): Observable<List<User>> {
        return dbHelper.getAllUsers()
    }


    override fun insertUser(user: User?): Observable<Boolean?> {
        return dbHelper.insertUser(user)
    }


}