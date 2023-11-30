package com.vt.repository

import com.vt.source.remote.RemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class JokesRepositoryImpl @Inject constructor(private val remoteDataSource: RemoteDataSource) :
    JokesRepository {
    override fun searchJokes(query: String?) {
        remoteDataSource.searchJokes(query)
    }
}