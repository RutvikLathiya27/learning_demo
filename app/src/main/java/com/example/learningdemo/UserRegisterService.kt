package com.example.learningdemo

import javax.inject.Inject

class UserRegisterService @Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: NotificationService
) {
    fun registerUser(email : String, password: String){
        userRepository.saveUser(email, password)
        emailService.send(email, "test@xyz.com", "User registered")
    }
}