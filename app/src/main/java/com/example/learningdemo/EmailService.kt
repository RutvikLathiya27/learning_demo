package com.example.learningdemo

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService{
    fun send(email : String, from: String , message: String)
}

class EmailService @Inject constructor() : NotificationService {
    override fun send(email : String, from: String , message: String){
        Log.e("RTK_EMAIL_SERVICE", "User register successfully Email")
    }
}

@Singleton
class MessageService(private val retryCount : Int)  : NotificationService {
    override fun send(email : String, from: String , message: String){
        Log.e("RTK_EMAIL_SERVICE", "Message - retry count ${retryCount}")
    }
}