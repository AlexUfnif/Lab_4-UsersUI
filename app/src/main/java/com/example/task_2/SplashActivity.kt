package com.example.task_2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity


/**
 * Экран-заставка со значком приложения и названием в центре.
 *
 * Это также экран запуска.
 *
 * Он откроет [MainActivity] после определенной задержки.
 */
class SplashActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)

        showMainActivityWithDelay()
    }

    private fun showMainActivityWithDelay() {
        // Использование обработчика для задержки загрузки MainActivity
        Handler(Looper.getMainLooper()).postDelayed({

            // Start activity
            startActivity(Intent(this, MainActivity::class.java))

            // Анимируем загрузку новой активности
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

            // Close this activity
            finish()

        }, 2000)
    }
}