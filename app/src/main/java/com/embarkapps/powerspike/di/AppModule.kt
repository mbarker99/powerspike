package com.embarkapps.powerspike.di

import com.embarkapps.powerspike.data.network.ApiServiceImpl
import com.embarkapps.powerspike.domain.network.ApiService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {
    @Binds
    abstract fun provideAppService(impl: ApiServiceImpl): ApiService
}