package com.example.composedaggerhilttest1.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}