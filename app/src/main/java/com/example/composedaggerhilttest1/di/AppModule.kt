package com.example.composedaggerhilttest1.di

import android.app.Application
import com.example.composedaggerhilttest1.data.remote.MyApi
import com.example.composedaggerhilttest1.data.reposotiry.MyRepositoryImpl
import com.example.composedaggerhilttest1.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMyAPI(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https:\\test.com")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(api: MyApi, app: Application): MyRepository {
        return MyRepositoryImpl(api, app);
    }
}