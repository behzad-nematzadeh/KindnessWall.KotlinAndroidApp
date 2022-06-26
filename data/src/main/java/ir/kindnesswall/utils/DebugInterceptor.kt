package ir.kindnesswall.utils

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import ir.kindnesswall.data.BuildConfig
import okhttp3.OkHttpClient

fun OkHttpClient.Builder.addDebugInterceptor(context: Context): OkHttpClient.Builder {
    if (BuildConfig.DEBUG)
        addInterceptor(ChuckerInterceptor(context))
    return this
}