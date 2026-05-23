package com.example.learningdemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailService = EmailService()
        val userRepository = UserRepository()

        val userRegisterService = UserRegisterService(userRepository, emailService)
        userRegisterService.registerUser("test@gmail.com", "Password")

    }
}