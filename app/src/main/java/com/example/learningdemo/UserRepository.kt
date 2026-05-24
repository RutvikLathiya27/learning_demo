package com.example.learningdemo

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(mail: String, password: String)
}

class SQLUserRepository @Inject constructor() : UserRepository {
    override fun saveUser(mail: String, password: String){
        Log.e("TAG", "Save user in DB : $mail")
    }
}

class FireBaseRepository @Inject constructor() : UserRepository{
    override fun saveUser(mail: String, password: String) {
        Log.e("TAG", "Save user in FB : $mail")
    }
}