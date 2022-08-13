package br.com.selbach

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

    class SplashScreenActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splashscreen)

            Handler().postDelayed({
                finish()
            }, 5000)
        }
}