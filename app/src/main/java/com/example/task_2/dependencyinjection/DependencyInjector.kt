package com.example.task_2.dependencyinjection

import android.content.Context
import androidx.room.Room
import com.example.task_2.data.database.AppDatabase
import com.example.task_2.data.database.dbmapper.DbMapper
import com.example.task_2.data.database.dbmapper.DbMapperImpl
import com.example.task_2.data.repository.Repository
import com.example.task_2.data.repository.RepositoryImpl


/**
 * Обеспечивает зависимости приложения.
 */
class DependencyInjector(applicationContext: Context) {

    val repository: Repository by lazy { provideRepository(database) }

    private val database: AppDatabase by lazy { provideDatabase(applicationContext) }

    private val dbMapper: DbMapper = DbMapperImpl()

    private fun provideDatabase(applicationContext: Context): AppDatabase =
        Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            AppDatabase.DATABASE_NAME
        ).build()

    private fun provideRepository(database: AppDatabase): Repository {
        val noteDao = database.noteDao()
        val colorDao = database.colorDao()

        return RepositoryImpl(noteDao, colorDao, dbMapper)
    }
}