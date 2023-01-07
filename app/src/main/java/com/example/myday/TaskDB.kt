package com.example.myday

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database (entities = [Task::class], version = 1)
abstract class TaskDB : RoomDatabase() {

    abstract fun getDao() : Dao

    companion object {
        fun getDB(context : Context) : TaskDB {
            return Room.databaseBuilder (
                context.applicationContext,
                TaskDB::class.java,
                "tasks.db"
            ).build()
        }
    }
}