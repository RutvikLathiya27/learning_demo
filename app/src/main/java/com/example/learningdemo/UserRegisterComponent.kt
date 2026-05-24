package com.example.learningdemo

import dagger.BindsInstance
import dagger.Component

@Component(modules = [NotificationServiceModule::class])
interface UserRegisterComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount: Int): UserRegisterComponent
    }
}