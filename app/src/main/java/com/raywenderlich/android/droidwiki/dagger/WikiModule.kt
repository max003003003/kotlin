package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.network.Homepage
import com.raywenderlich.android.droidwiki.network.Wiki
import com.raywenderlich.android.droidwiki.network.WikiApi
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by Max on 2/11/2018.
 */
@Module
class WikiModule{

@Provides
@Singleton
fun provideHomepage(api:WikiApi) = Homepage(api)

    @Provides
@Singleton
fun provideWiki(api:WikiApi) = Wiki(api)

}
