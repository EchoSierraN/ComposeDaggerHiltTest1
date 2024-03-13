package com.example.composedaggerhilttest1.data.reposotiry

import android.app.Application
import com.example.composedaggerhilttest1.R
import com.example.composedaggerhilttest1.data.remote.MyApi
import com.example.composedaggerhilttest1.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        var appName = appContext.getString(R.string.app_name)
        print("Hello from MyRepositoryImpl. App name is $appName")
    }
    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }

}