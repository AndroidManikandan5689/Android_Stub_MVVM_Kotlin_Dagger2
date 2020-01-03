package com.chozhanaadu.androidstub.data.local.db

import androidx.room.Database
import com.chozhanaadu.androidstub.data.model.db.User
import com.chozhanaadu.androidstub.data.local.db.dao.UserDao

@Database(
    entities = [User::class],
    version = 2
)
abstract class AppDatabase {

    abstract fun userDao(): UserDao?
}