package com.chozhanaadu.androidstub.data.local.db

import com.chozhanaadu.androidstub.data.model.db.User
import io.reactivex.Observable

interface DbHelper {

    fun getAllUsers(): Observable<List<User>>

    fun insertUser(user: User?): Observable<Boolean?>
}