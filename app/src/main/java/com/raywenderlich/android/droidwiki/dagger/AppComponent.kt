package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity
import com.raywenderlich.android.droidwiki.ui.search.SearchActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Max on 2/11/2018.
 */

@Singleton
@Component(modules = [
    AppModule::class,
    PresenterModule::class,
    NetworkModule::class,
    WikiModule::class])
interface AppComponent {
    fun inject(target: HomepageActivity)
    fun inject(target: SearchActivity)
}