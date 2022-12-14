package br.com.selbach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginBtn = findViewById<Button>(R.id.loginButton)
        loginBtn.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}