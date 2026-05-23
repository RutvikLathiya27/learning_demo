package com.example.learningdemo

class UserRegisterService(private val userRepository: UserRepository,
                          private val emailService: EmailService) {

    fun registerUser(email : String, password: String){
        userRepository.saveUser(email, password)
        emailService.send(email, "test@xyz.com", "User registered")
    }
}