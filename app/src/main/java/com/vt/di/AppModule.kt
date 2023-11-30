package com.vt.di

import com.vt.repository.JokesRepository
import com.vt.repository.JokesRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class AppModule {

    @Binds
    abstract fun bindJokesRepository(jokesRepositoryImpl: JokesRepositoryImpl): JokesRepository
}