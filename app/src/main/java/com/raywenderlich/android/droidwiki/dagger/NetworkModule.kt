package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.network.WikiApi
import com.raywenderlich.android.droidwiki.utils.Const
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
class NetworkModule{

companion object {
        private const val NAME_BASE_URL = "NAME_BASE_URL"
}

@Provides
@Named(NAME_BASE_URL)
fun providerBaseUrlString() = "${Const.PROTOCOL}://${Const.LANGUAGE}.${Const.BASE_URL}"

@Provides
@Singleton
fun provideHttpClient() = OkHttpClient()

@Provides
@Singleton
fun provideWikiApi(client: OkHttpClient, requestBuilder: HttpUrl.Builder?) =
        WikiApi(client, requestBuilder)


}