package com.example.hiltsampleproject

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// This pattern is used for implementing Hilt for third-party libraries.

// InstallIn(SingletonComponent) annotation makes it available during the lifetime of the entire
// application, rather than InstallIn(ActivityComponent) which makes it available during the
// lifetime of an activity.

@Module
@InstallIn(SingletonComponent::class)
object GsonModule {
    // Singleton annotation is used to ensure that the generated instance is the only one
    // throughout the application's lifecycle.
    @Singleton
    @Provides
    // The parameters tell Hilt the dependencies required to provide the type.
    fun provideGson(): Gson {
        // Return type tells Hilt what type the function provides instances of.
        // Function body tells Hilt how to provide an instance of the corresponding type.
        return Gson()
    }
}