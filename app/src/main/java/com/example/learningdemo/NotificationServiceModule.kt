package com.example.learningdemo

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule() {

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService{
        return emailService
    }

    /**
     * it not sef made that why we need to provide this imementation
     */
    @Named("message")
    @Provides
    fun getMessageService(retryCount : Int) : NotificationService{
        return MessageService(retryCount)
    }
}