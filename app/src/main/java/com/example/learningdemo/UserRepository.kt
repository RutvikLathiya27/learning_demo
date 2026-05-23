package com.example.learningdemo

import android.util.Log

class UserRepository {

    fun saveUser(username : String, password : String){
        Log.e("RTK_USER", "User save successfully >>>>>> $username $password")
    }

}