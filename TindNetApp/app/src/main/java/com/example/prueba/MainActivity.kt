package com.example.prueba

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput : EditText
    lateinit var passwordInput : EditText
    lateinit var logButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        logButton = findViewById(R.id.log_button)

        logButton.setOnClickListener{
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            Log.i("Usuario insertado:", "Username: $username and Password: $password")

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}