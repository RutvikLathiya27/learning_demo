package com.example.learningdemo

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)
@Module
class UserModule {

    @Provides
    @Named("firebase")
    fun provideFirebaseRepository(fireBaseRepository: FireBaseRepository) : UserRepository {
        return fireBaseRepository
    }

    @Provides
    @Named("sql")
    fun provideSQLRepository(sqlUserRepository: SQLUserRepository ) : UserRepository {
        return sqlUserRepository
    }


    //    @Provides
//    fun provideUserRepository(fireBaseRepository: FireBaseRepository) : UserRepository {
//        return fireBaseRepository
//    }

//    @Binds
//    abstract fun bindUserRepository(fireBaseRepository: FireBaseRepository): UserRepository



}