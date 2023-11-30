package com.vt.api

import com.vt.domain.JokesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/jokes/search")
    suspend fun searchJokes(@Query("query") query: String?): JokesResponse
}