package com.example.composedaggerhilttest1.data.reposotiry

import com.example.composedaggerhilttest1.data.remote.MyApi
import com.example.composedaggerhilttest1.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi
): MyRepository {
    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }

}