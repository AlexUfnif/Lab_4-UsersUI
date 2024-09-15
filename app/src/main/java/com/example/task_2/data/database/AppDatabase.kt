package com.example.task_2.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.task_2.data.database.dao.ColorDao
import com.example.task_2.data.database.dao.NoteDao
import com.example.task_2.data.database.model.ColorDbModel
import com.example.task_2.data.database.model.NoteDbModel


/**
 * База данных приложения.
 *
 * Он содержит две таблицы: таблицу заметок и таблицу цветов.
 */
@Database(entities = [NoteDbModel::class, ColorDbModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        const val DATABASE_NAME = "note-maker-database"
    }

    abstract fun noteDao(): NoteDao

    abstract fun colorDao(): ColorDao
}