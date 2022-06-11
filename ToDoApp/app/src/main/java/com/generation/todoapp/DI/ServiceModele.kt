package com.generation.todoapp.DI

import com.generation.todoapp.api.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object ServiceModele {

    @Singleton
    @Provides
    fun returnRepository(): Repository {
        return Repository()
    }

}