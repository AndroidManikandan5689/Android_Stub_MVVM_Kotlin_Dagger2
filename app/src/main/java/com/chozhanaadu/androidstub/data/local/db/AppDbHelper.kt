package com.chozhanaadu.androidstub.data.local.db

import com.chozhanaadu.androidstub.data.model.db.User
import io.reactivex.Observable
import javax.inject.Singleton

@Singleton
class AppDbHelper(private val appDatabase: AppDatabase) : DbHelper {

    override fun getAllUsers(): Observable<List<User>> {
        return Observable.fromCallable<List<User>> { appDatabase.userDao()?.loadAll() }
    }


    override fun insertUser(user: User?): Observable<Boolean?> {
        return Observable.fromCallable {
            appDatabase.userDao()?.insert(user)
            true
        }
    }

}