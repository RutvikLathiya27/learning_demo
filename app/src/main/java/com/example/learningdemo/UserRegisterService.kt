package com.example.learningdemo

import javax.inject.Inject
import javax.inject.Named

class UserRegisterService @Inject constructor(
    private val userRepository: UserRepository,
    @Named("message") private val emailService: NotificationService
) {
    fun registerUser(email : String, password: String){
        userRepository.saveUser(email, password)
        emailService.send(email, "test@xyz.com", "User registered")
    }
}