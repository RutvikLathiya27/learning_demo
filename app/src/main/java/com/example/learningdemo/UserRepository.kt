package com.example.learningdemo

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(username : String, password : String){
        Log.e("RTK_USER", "User save successfully >>>>>> $username $password")
    }
}