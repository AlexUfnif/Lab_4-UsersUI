package com.example.task_2

import android.app.Application
import com.example.task_2.dependencyinjection.DependencyInjector


/**
 * Класс приложения, отвечающий за инициализацию и выполнение зависимостей.
 */
class NotesApplication : Application() {

    lateinit var dependencyInjector: DependencyInjector

    override fun onCreate() {
        super.onCreate()
        initDependencyInjector()
    }

    private fun initDependencyInjector() {
        dependencyInjector = DependencyInjector(this)
    }
}