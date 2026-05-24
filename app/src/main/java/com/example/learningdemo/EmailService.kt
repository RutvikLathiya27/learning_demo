package com.example.learningdemo

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(email : String, from: String , message: String)
}

class EmailService @Inject constructor() : NotificationService {
    override fun send(email : String, from: String , message: String){
        Log.e("RTK_EMAIL_SERVICE", "User register successfully Email")
    }
}

class MessageService  : NotificationService {
    override fun send(email : String, from: String , message: String){
        Log.e("RTK_EMAIL_SERVICE", "User register successfully Message")
    }
}