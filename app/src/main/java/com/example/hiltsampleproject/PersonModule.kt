package com.example.hiltsampleproject

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier

// Module annotation informs Hilt how to provide dependencies when it cannot access the constructor.
// Module is used to identify modules
// InstallIn(ActivityComponent) declares that the following implementation will be alive only as
// long as the activity is active. The activity is, therefore, the component

@Module
@InstallIn(ActivityComponent::class)
abstract class PersonModule {
    // Bind annotation tells Hilt which implementation to use when it needs to provide an instance
    // of an interface. The information on how to provide the implementation is in the function
    // parameters.
    @EnglishQualifier
    @Binds
    abstract fun EnglishPersonImpl(englishPerson: EnglishPerson): Person

    @SpanishQualifier
    @Binds
    abstract fun SpanishPersonImpl(spanishPerson: SpanishPerson): Person
}

@Qualifier
annotation class EnglishQualifier

@Qualifier
annotation class SpanishQualifier