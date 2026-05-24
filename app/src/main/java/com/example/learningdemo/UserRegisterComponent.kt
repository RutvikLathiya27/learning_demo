package com.example.learningdemo

import dagger.Component

@Component(modules = [NotificationServiceModule::class])
interface UserRegisterComponent {
    fun inject(mainActivity: MainActivity)
}