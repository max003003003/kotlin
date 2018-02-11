package com.raywenderlich.android.droidwiki.dagger

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Max on 2/11/2018.
 */

@Module
class AppModule(private val app:Application){
    @Provides
    @Singleton
    fun provideContext(): Context = app
}