package com.example.learningdemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dagger.internal.DaggerCollections
import dagger.internal.DaggerGenerated
import jakarta.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRepo : UserRegisterService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userComponent = DaggerUserRegisterComponent.builder().build()
        userComponent.inject(this)
        userRepo.registerUser("test@gmail.com", "Password")

    }
}