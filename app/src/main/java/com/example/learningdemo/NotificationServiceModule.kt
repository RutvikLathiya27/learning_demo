package com.example.learningdemo

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NotificationServiceModule {
    @Binds
    abstract fun getNotificationServiceModule(messageService: MessageService): NotificationService
}